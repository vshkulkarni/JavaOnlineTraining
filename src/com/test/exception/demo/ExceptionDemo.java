package com.test.exception.demo;


public class ExceptionDemo {

	public static void main(String[] args) {
		

		try
		{
		int value=100;
		System.out.println(value/0);
		}
		catch(NullPointerException|ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please enter greate than zero value"+e);
		}
		finally
		{
			System.out.println("finally block get called ");
		}
		
		
		

	}

}

class ThrowExample
{
	public void display() throws Exception  //called    //calling method should handle this error 
	{
	System.out.println("test");	
	}
	
}