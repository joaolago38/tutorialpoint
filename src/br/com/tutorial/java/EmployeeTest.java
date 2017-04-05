package br.com.tutorial.java;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee empOne = new Employee("James Smitth");
		Employee empTwo = new Employee("Mary Anne");
		
		empOne.empAge(23);
		empOne.empDesegnation("Senior Developement");
		empOne.empSalary(10000);
		empOne.printEmployee();
		
		empTwo.empAge(30);
		empTwo.empDesegnation("Software Engineer");
		empTwo.empSalary(10000);
		empTwo.printEmployee();

	}

}
