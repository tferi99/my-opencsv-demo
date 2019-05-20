package org.ftoth.opencvsdemo.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvDate;
import com.opencsv.bean.CsvNumber;

import java.util.Date;

public class EmployeeNamedAndPositioned implements Employee
{
	@CsvBindByName(column = "ID", required = true)
	@CsvBindByPosition(position = 0)
	private String id;

	@CsvBindByName(column = "Name", required = false)
	@CsvBindByPosition(position = 1)
	private String name;

	@CsvBindByName(column = "Age", required = true)
	@CsvBindByPosition(position = 2)
	private String age;

	@CsvBindByName(column = "Country", required = true)
	@CsvBindByPosition(position = 3)
	private String country;

	@CsvBindByName(column = "Birth", required = true)
	@CsvBindByPosition(position = 4)
	@CsvDate("yyyy-MM-dd")
	private Date birth;

	@CsvBindByName(column = "Salary", required = true)
	@CsvBindByPosition(position = 5)
	@CsvNumber("#.###€")
	private int salary;

	@CsvBindByName(column = "Active", required = true)
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

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
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
