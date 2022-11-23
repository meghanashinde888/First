package com.obj;

public class Ob_cl
{
	String compname;
	String location;
	void accept(String c,String l)
	{
		compname=c;
		location=l;
	}
	void show()
	{
		System.out.println("Company name: "+compname);
  		System.out.println("Location: "+location);
  				
	}
	public static void main(String[] args)
	{
		Ob_cl o=new Ob_cl();
		o.accept("imphosys","Pune");
		o.show();
		
	}
	

}
