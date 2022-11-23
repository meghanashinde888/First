package com.thisEx;
class Ex
{
	Ex()
	{
		System.out.println("I am in constructor");
	}
	Ex(int x)
	{
		this();
		System.out.println("I m in "+x);
	}
	Ex(int x,int y)
	{
		this(x);
		System.out.println("I m in "+y);
	}
}

public class ThiskeyEx1
{
	public static void main(String []args)
	{
		Ex a=new Ex(10,20);
		
	}

}
