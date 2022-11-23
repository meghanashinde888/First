package com.ExceptionEx;

public class Exception2 
{
	public static void main(String[]args)
	{
		try
		{
			String name=null;
			System.out.println(name.length());
		}
		catch(NullPointerException a)
		{
			System.out.println("Rest of code....");
		}
		
	}

}
