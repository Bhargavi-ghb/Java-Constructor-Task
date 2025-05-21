package com.oops;

public class Employee {

	String name;
	double salary;
	
	public Employee(String empName,double empSalary) {
		name=empName;
		salary=empSalary;
		if(salary<0) {
			salary=0;
		}
	}
	
	public void displayDetails() {
		System.out.println(name + " " + salary + " ");
	}
	
	public static void main(String []args) {
		Employee emp = new Employee("Bhargavi",-7);
		emp.displayDetails();
	}
}
