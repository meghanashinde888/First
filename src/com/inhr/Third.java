package com.inhr;
class First
	{
		void methodA()
		{
			System.out.println("I am in A method");
		}
	}


class Second extends First
{
	void methodB()
	{
		System.out.println("I am in B method");
	}
}
class Third extends Second
{
	void methodC()
	{
	System.out.println("I am in C method");
}
	
		public static void main(String[]args)
		{
			Third c1=new Third();
			c1.methodA();
			c1.methodB();
			c1.methodC();
		}
	}


	

