package org.ftoth.opencvsdemo.read;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.MappingStrategy;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class OpenCsvBeanReader<T> implements OpenCsvReader<T>
{
	@Override
	public List<T> read(String file, Class clazz, MappingStrategy ms) throws Exception
	{
		Reader reader = new FileReader(new File(file));
		CsvToBean cb = new CsvToBeanBuilder(reader)
				.withType(clazz)
				.withMappingStrategy(ms)
				.build();
		return cb.parse();
	}
}
