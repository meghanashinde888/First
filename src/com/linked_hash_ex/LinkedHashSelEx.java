package com.linked_hash_ex;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSelEx
{
	public static void main(String[]args)
	{
		LinkedHashSet<String>lh=new LinkedHashSet<String>();
		lh.add("Good moring....");
		lh.add(null);
		lh.add("Good");
		lh.add("Good morning");
		lh.add("Good");
		
		System.out.println(lh);
		Iterator it=lh.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
