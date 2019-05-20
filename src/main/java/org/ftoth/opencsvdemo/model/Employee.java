package org.ftoth.opencvsdemo.model;

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

	int getSalary();
	void setSalary(int salary);

	boolean isActive();
	void setActive(boolean active);
}
