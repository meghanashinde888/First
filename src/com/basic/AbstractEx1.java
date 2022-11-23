package com.basic;
abstract class Shape
{
	Shape()
	{
		System.out.println("I m in Shape class");
	}
	abstract void draw();
}
class Rectangle extends Shape
{

	@Override
	void draw() 
	{
		// TODO Auto-generated method stub
		System.out.println("It's Rectangular shapes");
	}
	
}
class Circle extends Shape
{

	@Override
	void draw() 
	{
		// TODO Auto-generated method stub
		System.out.println("It's Circular shape");
	}
	
}

public class AbstractEx1 
{
	 public static void main(String[]args)
	 {
		 Shape r=new Rectangle();
		 r.draw();
		 Circle c=new Circle();
		 c.draw();
	 }
}


