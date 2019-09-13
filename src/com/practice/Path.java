package com.practice;

public class Path {
	
	
	public static void main(String [] args) {
		
		String a="/a/./b/../../c/";
		
		String [] b=a.split("/");
		System.out.println(b[0]+""+b[1]);
		
		
		
	}

}
