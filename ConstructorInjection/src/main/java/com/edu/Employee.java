
package com.edu;

public class Employee {
private int eid;
private String name;
private float salary;



public Employee(int eid, String name, float salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
}



public void display() {
	System.out.println("Employee id = "+ eid);
	System.out.println("EEmployee name = "+ name);
	System.out.println("employee salary ="+ salary);
}
}
