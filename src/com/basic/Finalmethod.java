package com.basic;
class Actor
{
	final void act()
	{
	System.out.println("Acting in drama school");
}
}
class Movie extends Actor
{
	void act1()
	{
		System.out.println("cting in movie");
	}
}
	

public class Finalmethod
{
public static void main(String[]args)
{
	Movie m=new Movie();
	m.act1();
	m.act();
	}
}
