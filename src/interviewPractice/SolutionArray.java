package interviewPractice;

public class SolutionArray {
	
	
	 static void minimumBribes(int[] q) {
		 Boolean result=true;
		 int count=0;
		 int c=0;
		         for(int i =0 ;i<q.length-1;i++){

		             if(q[i]-(i+1)<=2){
		            	 for (int j = i + 1; j < q.length; j++) 
		                     if (q[i] > q[j]) 
		                         count++; 
		             }
		             else {
		             result=false;
		             break;
		             }
		         }

		 if (result){
		 System.out.println(count);
		 }
		 else
		 System.out.println("Too chaotic");
		     }


	 public static void main(String[] args) {
		 
		 minimumBribes(new int[] {1 ,2, 5 ,3 ,7 ,8 ,6, 4});
	 }

}
