package com.ExceptionEx;

public class MultipleCatchEx
{
	public static void main(String[]args)
	{
		try
		{
			//int data[]=new int[5];    //as we go on changing inputs diff catches r executed
			//data[10]=22;
			int data=25/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(NullPointerException e)
		{
			System.out.println("Correct Exception occurs");
		}
		catch(Exception e)   //super Exception always at last
		{
			System.out.println("I am in Exception");
		}
	}
}
