package com.construct;

public class Constoverload 
{
	 String name;
	 int age;
	 String loc;
	 Constoverload()
	 {
		 System.out.println("I am in Default constructor");	
	 }
	 Constoverload(String n,int a)
	 {
		 name=n;
		 age=a;
		 System.out.println("Name:"+name);
		 System.out.println("Age:"+age); 
	 }
	 Constoverload(String l)
	 {
		 loc=l;
		 System.out.println("Location:"+loc);
	 }
	 public static void main(String[]args)
	 {
		 Constoverload c2=new Constoverload();
		 Constoverload c3=new Constoverload("Pune");
		 
		 Constoverload c1=new Constoverload("Meghana",30);
		 
		 
	 }
	 
		 
	 
	 

}
