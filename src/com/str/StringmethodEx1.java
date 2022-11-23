package com.str;

public class StringmethodEx1
{
		public static void main(String[]args)
		{
			String s="Ram";
			System.out.println("Lowercase String "+s.toLowerCase());
			System.out.println("Uppercase String "+s.toUpperCase());
			System.out.println(s);
			
			String str="Java";
			System.out.println("character at 0 location "+str.charAt(0));
			System.out.println("character at 1 location "+str.charAt(1));

			String str1="Meghana";
			System.out.println("character at 3 location "+str1.charAt(3));
			System.out.println("character at 5 location "+str1.charAt(5));
			
		
			String msg="Ashutosh";
			System.out.println("Length of string "+msg.length());
			
			String s1="Java is programmimg language.Java is a platform.Java is Island. ";
			String replaceString=s1.replace("Java","Python");
			System.out.println(replaceString);
			
			String sr1="javatpoint";
			String sr2="JAVATPOINT";
			String sr3="Python";
			System.out.println(sr1.equalsIgnoreCase(sr2));
			System.out.println(sr1.equalsIgnoreCase(sr3));
			System.out.println(sr1.equals(sr2));
			
			String ss="java string split method by javatpoint";
			String[] words=ss.split("s");
			System.out.println("After Split: ");
			for(int i=0;i<words.length;i++)
			{
				System.out.println(words[i]);
			}
			
			
		}

}
