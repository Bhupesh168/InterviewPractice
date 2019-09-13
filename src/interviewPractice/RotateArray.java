package interviewPractice;

public class RotateArray {
	
	
	public static void main(String[] args) {
		int a[]= {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
			
		for(int i =0 ;i<13;i++) {
			
			rotateArray(a);
		}
		for(int j=0;j<a.length;j++)
		System.out.println(a[j]);
	}
	
	
	static void rotateArray(int a[]){
		int c=a[0];
		//int last=a[a.length-1];
		for(int i =0;i<a.length-1;i++) {
			//int check=0;
			a[i]=a[i+1];
			
			
		}
		//a[0]=last;
		a[a.length-1]=c;
		
		//return null;
		
		
	}

}
