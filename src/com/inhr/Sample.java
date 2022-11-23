package com.inhr;


	class A
	{
		void methodA()
		{
		System.out.println("I am in method A");
	}
	}


class B extends A
{
	void methodB()
	{
		System.out.println("I m in class B");
		
	}
	
}
public class Sample
{
		public static void main(String[]args)
		{
			B b1=new B();
			b1.methodA();
			b1.methodB();
	}
}
