package br.com.tutorial.java;

public class Puppy {
	int puppyAge;

	public Puppy() {

	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.println("Puppy age is " + puppyAge);
		return puppyAge;
	}

	public Puppy(String name) {
		System.out.println("passed name is : " + name);
	}

	public static void main(String[] args) {
		Puppy puppy = new Puppy("tommy");
		puppy.setAge(2);
		puppy.getAge();
		System.out.println("Variable Value : " + puppy.getAge()); 

	}
}
