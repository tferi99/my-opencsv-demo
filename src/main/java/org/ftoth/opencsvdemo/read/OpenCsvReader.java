package org.ftoth.opencsvdemo.read;

import com.opencsv.bean.MappingStrategy;

import java.io.FileNotFoundException;
import java.util.List;

public interface OpenCsvReader<T>
{
	List<T> read(String file, Class clazz, MappingStrategy ms) throws Exception;
}
