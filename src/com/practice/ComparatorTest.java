package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

import com.practice.dto.Employe;

public class ComparatorTest  {

	
	public static void main(String [] args) {
		
		
		String a ="sample";
		
		a="#"+a.replaceAll("(.)", "$1#");
		
		System.out.println(a);
		Compare compare=new Compare();
		Employe e=new Employe("z",1);
		Employe e1=new Employe("x",3);
		Employe e2=new Employe("y",20);
		Employe e3=new Employe("a",20);
	
		Employe[] array= {e,e1,e2,e3};
	//Arrays.sort(array,compare);
	TreeSet<Employe> tree = new TreeSet<Employe>(compare);
	tree.addAll(Arrays.asList(array));
	for(Employe emp:tree){
	//System.out.println(array[i].score+"    "+array[i].name);
	System.out.println(emp.score);
	}}
	
}
	