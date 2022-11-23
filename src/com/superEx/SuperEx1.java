package com.superEx;

	class Animal
	{
		String color="white";
	}
	class Dog extends Animal
	{
		String color="Black";
		void Dis()
		{
			System.out.println("Dog Color:"+color);
			System.out.println("Animal Color:"+super.color);
			
			
		}
	}
	

public class SuperEx1
{
	public static void main(String[]args)
	{
		Dog d=new Dog();
		d.Dis();
	}
}
