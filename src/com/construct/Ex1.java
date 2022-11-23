package com.construct;

public class Ex1 
{
	Ex1()
	{
		System.out.println("Default constructor");
	}
		Ex1(int a)
		{
			System.out.println(a);
		}
		Ex1(String str)
		{
			System.out.println(str);
		}
		public static void main(String[]args)
		{
			Ex1 e=new Ex1();
			Ex1 e1=new Ex1(11);
			Ex1 e2=new Ex1("ram");
	}


}
