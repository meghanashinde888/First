package com.superEx;

	class Animal1
	{
		void eat()
		{
			System.out.println("Eating something");
			
		}
	}
	class Dog1 extends Animal1
	{
		void eat()
		{
			super.eat();
			System.out.println("Eating Bread....");
			
		}
	}
	public class SuperEx3 
	{

	
		public static void main(String[]args)
		{
			Dog1 d=new Dog1();
			d.eat();
			}
	}
		
	




	

