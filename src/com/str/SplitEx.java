package com.str;
import com.pack.ClassA;

public class SplitEx extends ClassA

{
	public static void main(String[]args)
	{
		String ss="java by string by method by javapoint";
		String[] words=ss.split("by");
		
		System.out.println("After Split");
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
			
		}
		
	}
	
}
