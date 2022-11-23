package com.inhr;
class AA
{
	void methodA()
	{
		System.out.println("Iam in method A and class A");
	}
}
class BB extends AA
{
	void methodB()
	{
		methodA();
	
		System.out.println("Iam in method B and class B");
	}
}
class C extends AA
{
	void methodC()
	{
		methodA();
	
		System.out.println("Iam in method C and class C");
	}
}
public class MyExample 
{
	 public static void main(String[] args)
	 {
		 BB b1=new BB();
		 b1.methodB();
		 
		 C c1=new C();
		 c1.methodC();
	 }
}
