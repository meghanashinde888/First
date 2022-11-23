package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInt 
		{
			public static void main(String[]args)
			{
				HashSet<Integer>hs=new HashSet<>();
				hs.add(10);
				hs.add(null);
				hs.add(10);
				hs.add(20);
				hs.add(30);
				hs.add(60);
	
				System.out.println(hs);
				Iterator it=hs.iterator();
				while(it.hasNext())
						{
						System.out.println(it.next());
						}
			}

		}




