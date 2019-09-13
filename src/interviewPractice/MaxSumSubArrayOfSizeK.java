package interviewPractice;

class MaxSumSubArrayOfSizeK {
	  public static int findMaxSumSubArray(int k, int[] arr) {

	    int start =0 ;
	    int target=0;
	    int max=0;
	    int sum=0;
	    for(int i=target;i<arr.length;i++){
	      
	      sum+=arr[target];
	      
	      if(target>=k){
	    	 
	    	  sum-=arr[start];
	    	  if(max<sum){
		  	        max=sum;
		  	      }
	    	  start++;
	      
	      }
	      target++;
	    }

	    // TODO: Write your code here
	    return max;
	  }
char [] i = new char[5];

	  public static void main(String[] args) {
	    System.out.println("Maximum sum of a subarray of size K: "
	        + MaxSumSubArrayOfSizeK.findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
	    System.out.println("Maximum sum of a subarray of size K: "
	        + MaxSumSubArrayOfSizeK.findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
	    char a= (char)97;
	    if("".equalsIgnoreCase("")) {
	    
	    System.out.println(a);
	  }
	}
}