package com.collection;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetEx 
{
	
		public static void main(String[]args)
		{
			HashSet<String>hs=new HashSet<String>();
			hs.add("Good morning....");
			hs.add(null);
			hs.add("Good");
			hs.add("Good morning....");
			hs.add("Good");
			hs.add("Good");
			
			System.out.println(hs);
			Iterator it=hs.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}

	}


