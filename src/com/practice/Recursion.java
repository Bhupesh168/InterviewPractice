package com.practice;

import java.util.ArrayList;
import java.util.List;

public class Recursion {
	
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		
		helper(0,list);
		
		
	}

	private static void helper(int index, List list) {
		  if ( index >= list.size()) {
		    return;
		  }
			helper(index + 1, list);
		  System.out.print(list.get(index));
		}
}
