package com.obj;

public class Collage_ob_cl
{
	String name;
	int id;
	String collage_name="COEP";
	void dis(String s,int i)
	{
		name=s;
		id=i;
		
	}
	void display()
	{
		System.out.println("Name="+name);
		System.out.println("id="+id);
		
		System.out.println("collage_name="+collage_name);
		
	}
	public static void main(String[] args)
	{
		Collage_ob_cl c=new Collage_ob_cl();
		c.dis("Meghana",5);
		c.display();
	}
	

}
