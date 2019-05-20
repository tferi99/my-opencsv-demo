package org.ftoth.opencvsdemo;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.ftoth.opencvsdemo.model.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
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
		//String file = "emp.csv";
		//String file = "empNoFormat.csv";
		String file = "empWithColumn.csv";
		//String file = "empWithColumnCapital.csv";
		//String file = "empWithColumnMixed.csv";
		//String file = "empWithColumnMissing.csv";

		String[] columns = {
			"id",
			"name",
			"age",
			"country",
			"birthStr",
//			"birth",
			"salary"
		};

		String[] columnsCapital = {
				"ID",
				"NAME",
				"AGE",
				"COUNTRY",
				"BIRTHSTR",
//			"BIRTH",
				"SALARY"
		};

		ColumnPositionMappingStrategy posMapSt = new ColumnPositionMappingStrategy();
		posMapSt.setColumnMapping(columnsCapital);
		posMapSt.setType(EmployeeSimple.class);

		List beans = new CsvToBeanBuilder(new FileReader(file))
				//.withType(EmployeeNamed.class)
				.withType(Employee.class)

//				.withMappingStrategy(posMapSt)
				.withSeparator(',')
				.withQuoteChar('\'')
//			.withSkipLines(2)
				.build().parse();

		System.out.println(beans.size());
		for(Object bean : beans) {
			System.out.println(bean);
		}
	}
}
