package com.basic;

public class switch_iphone 
{
	public static void main(String []args)
	{
		String mobile="iphone";
		switch(mobile)
		{
		case"samsung":System.out.println("Buy a samsung iphone");
				break;
		case"iphone" :	System.out.println("Buy a iphone");
		        break;
		case"motorola" :System.out.println("Buy a motorola iphone");
		        break;
		default:System.out.println("In default");        
		}
	}
}
