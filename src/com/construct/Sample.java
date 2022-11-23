package com.construct;

public class Sample 
{
	String name;
	String city;
	int age;
	Sample()
	{
		System.out.println("I am in Default constructor ");
	}
	Sample(String n,String c)
	{
		name=n;
		city=c;
		System.out.println("Name:"+name);
		System.out.println("City:"+c);
	}
		Sample(int a)
		{
			age=a;
			System.out.println("Age:"+age);
		}
		public static void main(String[] args)
		{
		Sample s2=new Sample("Gauri","Pune");
		Sample s3=new Sample(35);
		Sample ss=new Sample();
}
}
