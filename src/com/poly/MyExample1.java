package com.poly;

	class Bank 
	{
		void getRateofinter()
		{
			System.out.println("Interest 5%");
	
		}
	}
		class SBI extends Bank
		{

		void getRateofinter()
		{
			System.out.println("Interest 2.5%");
	
		}
	}

public class MyExample1
{
  public static void main(String[] args)
  {
	 SBI s=new SBI();
	 s.getRateofinter();
	 
	 Bank b=new Bank();
	 b.getRateofinter();
			 
	 
 }
}


