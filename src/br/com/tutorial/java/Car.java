package br.com.tutorial.java;

public class Car extends Vehicle {
	public static void main(String args[]) {
		 Vehicle a = new Car();
	      boolean result =  a instanceof Car;
	      System.out.println( result );
	}

}
