package com.ExceptionEx;

public class FinallyEx 
{
	public static void main(String[]args)
	{
		try
		{
			System.out.println("Inside the try block");
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code");
	}
}
