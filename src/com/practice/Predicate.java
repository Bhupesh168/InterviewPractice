package com.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public abstract class  Predicate {
	
	
	
	
	public static void main(String [] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		
		
		
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		
		java.util.function.Predicate<Integer> p = (n -> n < 6);
		java.util.function.Predicate<Integer> p1 = (n -> n%2==0);
		java.util.function.Predicate<Integer> p2 = p.and(p1);
		
		
		
		
		List<Integer> b=a.stream().filter(p2).collect(Collectors.toList());
		
		System.out.println(b);
		
		
	}
}
