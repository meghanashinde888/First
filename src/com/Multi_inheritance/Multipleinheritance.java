package com.Multi_inheritance;
interface Bird
{
  int price=1000;
  void color();
}
class Birdliving
{
	void cage()
	{
		System.out.println("Lives in nest and Cage");
	}
	
}
public class Multipleinheritance extends Birdliving implements Bird
{


@Override
public void color() 
	// TODO Auto-generated method stub
	{
		System.out.println("i m in multipleinheritance");
	}
	public static void main(String[]args)
	{
		Multipleinheritance m=new Multipleinheritance();
		m.cage();
		m.color();
	
	}
	
}
