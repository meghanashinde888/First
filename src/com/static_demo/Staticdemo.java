package com.static_demo;

public class Staticdemo 
{
	static int count=0;
	public static void main(String []args)
	{
		Staticdemo s=new Staticdemo();
		System.out.println(s.count++);
		
		Staticdemo s1=new Staticdemo();
		System.out.println(s1.count++);
		
		Staticdemo s2=new Staticdemo();
		System.out.println(s2.count++);
		
		
		
		
	}
	

}
