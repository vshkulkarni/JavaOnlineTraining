package com.test.string.demo;

public class Employee {
	private int id;
	private String name;
	private String address;
	private String salary;

	/*
	 * public Employee(int id, String name) { this.id = id; this.name = name; }
	 */

	public Employee(int id, String name, String salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
