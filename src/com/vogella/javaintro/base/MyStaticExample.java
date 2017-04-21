package com.vogella.javaintro.base;

public class MyStaticExample {
    static String PLACEHOLDER = "TEST";

    static void test() {
            System.out.println("Hello");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStaticExample ab = new MyStaticExample();
		ab.test();
		System.out.println("Valor String :" + PLACEHOLDER );

	}

}
