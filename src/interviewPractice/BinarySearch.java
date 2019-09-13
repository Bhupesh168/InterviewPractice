package interviewPractice;

public class BinarySearch {
	
	static double root(double x, int n) {
	    double l =0;
	    double r =x ;
	    double mid=0;
	    double val=0;
	    while (l<=r){
	    
	      mid = (l+r)/2;
	    
	      
	      val=multiply(mid,n);
	     
	      if(val==x || val==x+0.001 || val==x-0.001  ) {
		    	 return mid;
		     }
	     	      if(val<x+0.001){
	      l=mid;
	      
	      }
	     
	      else if(val>x+0.001 ){
	        r=mid;
	      }
	      else {
	    	  return mid;
	      }
	     
	   }
	  
	return mid;
	    
	      // your code goes here
	  }
	  
	  static double multiply(double val,int n){
	    double ritz=1;
	    for(int i =0 ;i<n;i++){
	      ritz=val*ritz;
	      
	    }
	  return ritz;
	  }

	public static void main(String [] args) {
		System.out.println(root(9,2));
		
		
	}
}
