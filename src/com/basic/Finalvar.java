package com.basic;
abstract class Bank
{
	void info()

{
	System.out.println("Bank gives homeloan");
	}
abstract void interest();
}
class SBI extends Bank
{

@Override
void interest() {
	// TODO Auto-generated method stub
	System.out.println(" Interest provided by SBI is 5%");
}
}
public class Finalvar
{
public static void main(String[]arg)
{
	SBI s=new SBI();
	s.interest();
	s.info();
	}
}
