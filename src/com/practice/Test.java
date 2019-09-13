package com.practice;

import java.util.ArrayList;

public class Test<T> {
 
	T obj ;
	
	void create(T t){
		obj=t;
	}
	String b = new String("hi");
 ArrayList a= new ArrayList();
	
	public static void main(String [] args) {
		{
            Test<String> test= new Test<String>();
            test.create("");
        }	
		
	}
	
	
	public void  test(ArrayList array) {

		
	}
	
}
