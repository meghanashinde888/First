package com.static_demo;

public class Staticex 
{
		int rollno;
		String name;
		static String college_name="COEP";
		void accept(String s,int r)
		{
			name=s;
			rollno=r;
		}
		void display()
		{
			System.out.println("Name:"+name);
			System.out.println("Roll no:"+rollno);
			System.out.println("Collage Name:"+college_name);	
		}
		public static void main(String[] args)
		{
			Staticex s1=new Staticex();
			s1.accept("Meghana",15);
			s1.display();
			
			Staticex s2=new Staticex();
			s2.accept("Tejaswini",16);
			s2.display();
			
			
			
		}
		

}
