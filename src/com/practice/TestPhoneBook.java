package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class TestPhoneBook {
	
	
	public static void main(String []argh)
	{	HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextDouble();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			phoneBook.put(name,phone);
			in.nextLine();
			
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(phoneBook.containsKey(s)) {
				System.out.println(s+"="+phoneBook.get(s));
			}
			else
				System.out.println("Not found");
		}
	}

}
