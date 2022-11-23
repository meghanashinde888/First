package com.ExceptionEx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Demo
{
	public static void main(String[]args)throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name");
		String name=b.readLine(); 
	}
}
