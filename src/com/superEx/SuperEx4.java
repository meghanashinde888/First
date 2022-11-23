package com.superEx;

class Animal4
{
	String color="White";
}
class Dog2 extends Animal4
{
	 String color="Black";
	 void Dis()
	 {
 		System.out.println("Dog Color:"+color);
 		System.out.println("Animal color:"+super.color);
	 }
}
class Cat extends Dog2
{
	String color="Gray";
	void display()
	{
		System.out.println("Dog Color*****"+super.color);
		System.out.println("Cat color****"+color);
	}
	}


public class SuperEx4 
{
	
		public static void main(String[] args)
		{
		Dog2 d=new Dog2();
		d.Dis();
		Cat c=new Cat();
		c.display();
		
		
		}
	}


