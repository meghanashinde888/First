package com.construct;
/*parameterised constructor*/

public class Para_cnstr
{
	String name;
	String location;
	Para_cnstr(String n,String l)
	{
		name=n;
		location=l;
	}
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Lacation: "+location);
	}
	public static void main(String[] args)
	{
		
		Para_cnstr p=new Para_cnstr("HCL","Pune");
		p.display();
	}
	
	
}
