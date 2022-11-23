package com.construct;

public class Ex
{
	int num1,num2,sum;
	Ex(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	void dis()
	{
		sum=num1+num2;
		System.out.println("Value of num1...."+num1);
		System.out.println("Value of num2...."+num2);
		System.out.println("Addition...."+sum);	
	}
	public static void main(String[] args)
	{
		Ex x=new Ex(10,20);
		x.dis();
		Ex x1=new Ex(10,20);
		x1.dis();
	}

}
