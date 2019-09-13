package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution21 {
	
	int finalCount=0;
	
	 public List<List<String>> partition(String s) {
	      char[] c=s.toCharArray();
	        List<List<String>> list= new ArrayList<List<String>>();
	        List<String> list1=new ArrayList<String>();
	        int i =0;
               
          int count1=0;

	       if(!(s.length()==1) && !(s.length()==0)){
          while(i<c.length){
	           list1.add(c[i]+"");
	            i++;
	        }
	        list.add(list1);
	       
	        
	    for(int j=0;j<s.length();j++){
	    	 list1=new ArrayList<String>();
	    	 int k =j+1;
	    	 if(finalCount>1) {
	        	  j=j-1;
	        	  k=k+1;
	          }
	    	 for( ;k<s.length();k++){
	          if(isPlainDromString(s.substring(j,k+1)) && count1==0) {
	            
	         list1.add(s.substring(j,k+1)  ); 
	           
                 count1++;
	        }
	        else{
	          
           list1.add(c[k-j]+"");
           }
	          
	    }
	      count1=0;
	      finalCount=0;
	      if(!list1.isEmpty()) {
	      list.add(list1);
	      }
	    }
	  
          }
          else{
              list1.add(s);
          list.add(list1);
          }
          
	      
          return  list;
	    
	    }
	    
	    Boolean isPlainDromString(String s){
	      char[] auxCharArray= s.toCharArray();  
	        int j=auxCharArray.length-1;
	        for(int i =0;i<auxCharArray.length/2;i++){
	            if(auxCharArray[i]!=auxCharArray[j]){
	                return false;
	                
	            }
	            
	            j--;
	        }
	        finalCount++;
	        return true;
	    }
	
public static void main(String [] args) {
	
	Solution21 s = new Solution21();
	System.out.println(s.partition("fff"));
	
	"fff".hashCode();
Object.class.hashCode();

HashMap map = new HashMap();
map.put(1, "s");

}
}



