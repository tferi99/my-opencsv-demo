package org.ftoth.opencsvdemo;

import com.opencsv.CSVReader;
import com.opencsv.bean.*;
import org.ftoth.opencsvdemo.model.*;

import java.io.*;
import java.util.List;

public class App
{
	public static void main(String[] args)
	{
		App app = new App();
		try {
			app.test();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void test() throws FileNotFoundException
	{
/*		String[] columns = {
				"id",
				"name",
				"age",
				"country",
				"birth",
				"salary",
				"active"
		};

		ColumnPositionMappingStrategy posMapSt = new ColumnPositionMappingStrategy();
		posMapSt.setColumnMapping(columns);
		posMapSt.setType(EmployeePositioned.class);*/

		System.out.println("----------------------------- without header --------------------------------");
		String file = "emp.csv";
		Reader rd = new FileReader(file);
		List beans = new CsvToBeanBuilder(rd)
				.withType(EmployeePositioned.class)
				//.withMappingStrategy(posMapSt)
				.withSeparator(',')
				.withQuoteChar('\'')
				//.withSkipLines(1)
				.build().parse();
		printBeans(beans);
		try {
			rd.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// List<MyBean> beans comes from somewhere earlier in your code.
		try {
			Writer writer = new FileWriter("out.csv");
			StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
					.withApplyQuotesToAll(false)
					.build();
			beanToCsv.write(beans);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\n----------------------------- with header --------------------------------");
		List beans2 = null;
		try {
			String file2 = "emp-withColumn.csv";
			Reader rd2 = new FileReader(file2);
				beans2 = new CsvToBeanBuilder(rd2)
					.withType(EmployeeNamedAndPositioned.class)
					.withSeparator(',')
					.withQuoteChar('\'')
					.withSkipLines(1)
					.build().parse();
			printBeans(beans2);
			rd2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			String file2 = "emp-withColumn.csv";
			Reader rd2 = new FileReader(file2);
			CSVReader rd2csv = new CSVReader(rd2);
			HeaderColumnNameMappingStrategy<EmployeeNamedAndPositioned> strategy = new HeaderColumnNameMappingStrategy<EmployeeNamedAndPositioned>();
			strategy.setType(EmployeeNamedAndPositioned.class);
			strategy.captureHeader(rd2csv);
			//strategy.setColumnOrderOnWrite(new EmployeeHeaderNameComparator());		// you don't need it, order comes from captured header
			Writer writer = new FileWriter("out-withColumn.csv");
			StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer)
					.withApplyQuotesToAll(false)
					.withMappingStrategy(strategy)
					.build();
			beanToCsv.write(beans2);
			writer.close();
			rd2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void printBeans(List<?> beans)
	{
		System.out.println(beans.size());
		for(Object bean : beans) {
			System.out.println(bean);
		}
	}
}
