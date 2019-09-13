package com.practice;

import java.io.IOException;

public class InA {
	
	{
		System.out.println("In A static block");
	}
	
	{
		System.out.println("In Instance block of A");
	}
	
	
	InA(){
		System.out.println("IN A constructor");
		
	}
	
	public  void a() throws RuntimeException{
		
	}

}
