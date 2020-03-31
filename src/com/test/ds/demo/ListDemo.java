package com.test.ds.demo;

import java.util.ArrayList;
import java.util.List;

import com.test.string.demo.Employee;

public class ListDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(101, "vishnu", "10000");
		Employee emp1 = new Employee(101, "vishnu", "20000");
		Employee emp2 = new Employee(101, "vishnu", "3000");
		Employee emp3 = new Employee(101, "vishnu", "40000");

		List<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);   //50 
		for (Employee empIterate : list) {
			System.out.println(empIterate.getId());
			System.out.println(empIterate.getName());

		}
		
		

	}

}
