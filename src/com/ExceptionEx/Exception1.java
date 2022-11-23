package com.ExceptionEx;

public class Exception1 
{
	public static void main(String[]args)
	{
			try
			{
			//code that may rise exception
			int data=100/0;
			System.out.println("Hiiieee");
			}
		 	
		 	catch(ArithmeticException e)	
			{
		 		System.out.println(e);
			}
		
		System.out.println("rest of the code");
	}

}
