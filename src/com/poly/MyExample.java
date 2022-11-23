package com.poly;

public class MyExample 
{
	 void submit(String name,int mobno)
	 {
		 System.out.println("Name "+name);
		 System.out.println("Mob_no "+mobno);
		 
	 }
	 
	 void submit(String name,int mobno,int adharno)
	 {
		 System.out.println("Name "+name);
		 System.out.println("Mob_no "+mobno);
		 System.out.println("Adhar no "+adharno);
		 
	 }
	 
	 public static void main(String[]args)
	 {
	 MyExample m=new MyExample();
	 m.submit("ram",915246);
	 m.submit("ram",1233287,12);
	 

	 }
}