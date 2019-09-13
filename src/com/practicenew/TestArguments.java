package com.practicenew;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import com.practice.dto.Employe;

public class TestArguments {

    public static void main(String[] args) {
    	ArrayList<String> a= new ArrayList<String>();
    	a.add(null);
    	
    	Employe e= new Employe("a",1);
    	e.setList(null);
    	
    	for(Object b:e.getList()) {
    		System.out.println("HI");
    		
    	}
    	 
    	 
    	
       
    }
}

