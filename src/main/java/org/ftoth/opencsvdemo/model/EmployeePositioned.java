package org.ftoth.opencsvdemo.model;

import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;

import java.util.Date;

public class EmployeePositioned implements Employee
{
	@CsvBindByPosition(position = 0)
	private String id;

	@CsvBindByPosition(position = 1)
	private String name;

	@CsvBindByPosition(position = 2)
	private String age;

	@CsvBindByPosition(position = 3)
	private String country;

	@CsvBindByPosition(position = 4)
	private double salary;

	@CsvBindByPosition(position = 5)
	@CsvDate("yyyy-MM-dd")
	private Date birth;

	@CsvBindByPosition(position = 6)
	private boolean active;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getBirth()
	{
		return birth;
	}

	public void setBirth(Date birth)
	{
		this.birth = birth;
	}

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public boolean isActive()
	{
		return active;
	}

	public void setActive(boolean active)
	{
		this.active = active;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " {id: " + id + ", name:" + name + ", age:" + age + ", country:" + country + ", birth:" + birth + ", salary:" + salary + ", active:" + active + "}";
	}
}
