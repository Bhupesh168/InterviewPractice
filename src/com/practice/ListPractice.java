package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	
	public static void main(String [] args) {
		int numRows=5;
		 List<List<Integer>> list=new ArrayList<List<Integer>>();
	        List<Integer> list2=new ArrayList<Integer>();
	        
	        for(int i=0;i<numRows;i++){
	            List<Integer> list1=new ArrayList<Integer>();
	       if(list2.isEmpty()){
	           list1.add(1);
	           list.add(list1);
	       }
	            else if(list2.size()==1){
	                list1.add(1);
	                list1.add(1);
	                list.add(list1);
	                
	            }
	           else{              
	            list1.add(1);
	           	        	   for(int j=1;j<list2.size()-1;j++){
	                list1.add(list2.get(j)+list2.get(j-1));
	            }   
	           	        	 list1.add(1);

	              list1.add(i-1,list2.get(i-1)+list2.get(i-2));
	         
	               list.add(list1);
	           }
	       list2.clear();
	            list2.addAll(list1);
	        }
	         
		System.out.println(list);
		
	}

}
