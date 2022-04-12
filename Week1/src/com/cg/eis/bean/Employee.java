package com.cg.eis.bean;

public class Employee {
	int id;
	String firstname;
	String lastname;
	int salary;
	String designation;
	String inuranceScheme;
	
	public Employee(String firstname, String lastname, int id, String designation, int salary) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.designation=designation;
		this.salary=salary;
	}
}
