package com.practice;

public class InB  extends InA{
	
	static {
		
		System.out.println("InB static block");
	}
	
	
	InB(){
		
		System.out.println("IN B constructor");
	}
	
	{
		System.out.println("IN instance block of B");	
			
		}
	public  void a() {
		
	}


}
