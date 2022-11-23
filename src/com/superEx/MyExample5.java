package com.superEx;

	class Persons
	{
		String name;
		int age;
	
	Persons(String n,int a)  //constructor
	{
		name=n;
		age=a;
	}
		void dis()
		{
			System.out.println("name:..."+name);
			System.out.println("Age:...."+age);
		}
}
class Emp extends Persons
{
		int id;
		Emp(String n,int a,int d)
		{
				super(n,a);
				id=d;
		}
        void display()
	    {
		dis();
		System.out.println("id:"+id);
	    }
}


public class MyExample5 
{
         public static void main(String[]args)
	        {
			Emp e=new Emp("Ram",21,5);
			e.display();
			
	        }
}
	


