package com.basic;

public class Donate_blood_nested_if_java 
{
	public static void main(String args[])
	{
		int age=50;
		int weight=60;
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("You are eligible for blood donate");
			}
			else
			{
				System.out.println("You r not eligible");
			}
		}
	}

}
