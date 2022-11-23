package com.inhr;
class Person
{

	
	String name;
	int age;
	void accept(String n,int a)
	{
		name=n;
		age=a;
	}			
	   void display()
		{
			System.out.println("Name: "+name);
			System.out.println("Age: "+age);
			
		
	}
}

 public class Emp extends Person
   {
       String cname;
       void acc(String c)
            {
              cname=c;
            }
              void dis()
              	{
              		display();
            	    System.out.println("Company name "+cname);
                }
   public static void main(String[] args)
   	{
		Emp e=new Emp();
		e.accept("Ram",30);
		e.acc("HCL");
		e.dis();
	}
}
	
	

