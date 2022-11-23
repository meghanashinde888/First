package com.str;

public class StringSample 
{
	public static void main(String[]args)
		{
			String s1=new String("Hi");
			String s2=new String("Hello");
			String s3=new String("hi");
			System.out.println(s1.equals(s2));
			System.out.println(s2.equals(s3));
			System.out.println(s1==s2);
			System.out.println(s1==s3);
			
			
			String a1="Meghana";
			String a2="Shinde";
			String a3="Gauri";
			System.out.println(a1==a2);
			System.out.println(a1==a3);
			
			
			String a4=new String("Gauri");
			System.out.println(a3==a4);
			System.out.println(a3.equals(a4));
			
		}

}
