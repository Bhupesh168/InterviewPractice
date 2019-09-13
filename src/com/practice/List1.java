package com.practice;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	
	
	public static void main(String [] args) {
List1 l=new List1();
List<List<Integer>> list=l.generate(5);
	System.out.println(list);
	}
	 List<List<Integer>> list= new ArrayList<List<Integer>>();
     List<Integer> list1=new ArrayList<Integer>();
    
public List<List<Integer>> generate(int numRows) {
        
	List<Integer> list2=new ArrayList<Integer>();
        
        if(numRows==1){
        list2.add(1);
          list.add(list2);
            return list;
            
        }
        
            
            generate(numRows-1);
            if(list.get(list.size()-1).size()==1){
                
                list2.add(1);
                list2.add(1);
                list.add(list2);
                
            }
            else {
            list1.addAll(list.get(numRows-2));
            	list2.add(1);
            	 for(int j=1;j<list2.size()-1;j++){
 	                list2.add(list1.get(j)+list1.get(j-1));
 	            }   
            	
            list2.add(list1.size()/2,list1.get((list1.size()/2)+list1.get((list1.size()/2-1))));
            list2.add(1);
            list.add(list2);
            
            }
            
         
        
       return list;
}


}
