package org.ftoth.opencvsdemo.model;

import java.util.Date;

public class EmployeeSimple implements Employee
{
	private String id;
	private String name;
	private String age;
	private String country;
	private Date birth;
	private String birthStr;
	private int salary;
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

	public String getBirthStr()
	{
		return birthStr;
	}

	public void setBirthStr(String birthStr)
	{
		this.birthStr = birthStr;
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
