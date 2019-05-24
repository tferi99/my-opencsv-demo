package org.ftoth.opencsvdemo.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import java.util.Date;

public class EmployeeNamed implements Employee
{
	@CsvBindByName(column = "ID", required = true)
	private String id;

	@CsvBindByName(column = "Full Name", required = true)
	private String name;

	@CsvBindByName(column = "Age", required = true)
	private String age;

	@CsvBindByName(column = "Country/Location", required = true)
	private String country;

	@CsvBindByName(column = "Salary", required = true)
	private double salary;

	@CsvBindByName(column = "Birth Date", required = true)
	@CsvDate("yyyy-MM-dd")
	private Date birth;

	@CsvBindByName(column = "Is Active", required = true)
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
