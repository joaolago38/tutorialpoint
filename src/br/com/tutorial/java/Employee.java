package br.com.tutorial.java;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(int age) {
		super();
		this.age = age;
	}

	 public void empAge(int emAge){
		age =  emAge;
	 }

	 public void empDesegnation(String empDesing){
		 designation = empDesing;
	 }
	 public void empSalary(double empSalary){
		 salary = empSalary;
	 }
	 public void printEmployee(){
		 System.out.println("Name : " + name);
		 System.out.println("Age : " + age);
		 System.out.println("Designation : " + designation);
		 System.out.println("Salary  : " + salary);
	 }
}
