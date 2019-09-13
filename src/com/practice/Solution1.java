package com.practice;

public class Solution1 {
   public static void main(String [] args) {
	   Solution1 solution = new Solution1();
	   String d="";
	   int isPlaindrome=0;
	  String A= "A man, a plan, a canal: Panama";
	   String b = A.replaceAll("[^(a-zA-Z0-9]","").replaceAll("//s", "");
	   String b1=b.toLowerCase();
	    

	   for(int j=0;j<b1.length()-1;j++) {
		   for(int k=b1.length()-1;k>j;k--) {
			   
			  isPlaindrome =solution.isPalindrome(b1.substring(j,k));	
			  if(isPlaindrome==1 && d.length()<b1.substring(j, k).length()) {
				  d=b1.substring(j, k);
				  
			  }
		   }
		   
	   }
	 System.out.println(d);  
	   
   }
	
	
	public int isPalindrome(String b1) {
		char[] c=b1.toCharArray(); 
for(int i=0;i<c.length/2;i++){
    
   
        
        if(c[i]!=c[c.length-1-i]){
            
            
            return 0;
           
        }
    }
  
    

   return 1;     
    }
}
