package com.customExceptionEx;
class MyExcept extends Exception
{
		MyExcept(String str)
		{
		super(str);
		}
}

public class CustomException1
{
	public static void main(String[]args)

	{
		int age=21;
		try
		{
			if (age>18)
			{
				throw new MyExcept( "Eligible for voting");
			}
			else
			{
				throw new MyExcept("Not Eligible for voting");
			}
		}
		catch(MyExcept e)
		{
			System.out.println(e);
		}
	}
}
