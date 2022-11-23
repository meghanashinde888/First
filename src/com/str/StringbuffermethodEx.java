package com.str;

public class StringbuffermethodEx
{
	public static void main(String[] args)
	{
		StringBuffer sb6=new StringBuffer();
		System.out.println(sb6.capacity());
		sb6.append("Hello");
		System.out.println(sb6.capacity());
		sb6.append("java is my favourite language");
		System.out.println(sb6.capacity());
		
		StringBuffer sb5=new StringBuffer("Hello Good Morning");
		sb5.reverse();
		System.out.println(sb5);
	}

}
