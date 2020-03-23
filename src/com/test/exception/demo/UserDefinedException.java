package com.test.exception.demo;

class MyException extends Exception {

	public MyException(String str) {
		
	}

}

public class UserDefinedException {

	public static void main(String[] args) {
		try {
			
			throw new MyException("My exception");   //throw exception
			
		} catch (MyException exObj) {
			System.out.println("exception caught" + exObj);
		}

	}

}
