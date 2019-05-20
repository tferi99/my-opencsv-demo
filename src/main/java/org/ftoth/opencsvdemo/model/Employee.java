package org.ftoth.opencsvdemo.model;

import java.util.Date;

public interface Employee
{
	String getId();
	void setId(String id);

	String getName();
	void setName(String name);

	String getAge();
	void setAge(String age);

	String getCountry();
	void setCountry(String country);

	Date getBirth();
	void setBirth(Date birth);

	double getSalary();
	void setSalary(double salary);

	boolean isActive();
	void setActive(boolean active);
}
