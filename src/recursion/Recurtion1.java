package recursion;

import java.util.ArrayList;
import java.util.List;

public class Recurtion1 {
	
	
	public static void main(String [] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
		
		List list1=test(list,0);
		System.out.println(list1);
		
	}

	
static ArrayList<Integer> test (List<Integer> list,int n) {
	
	ArrayList<Integer> list1 = new ArrayList<Integer>();	
	//System.out.println(list);
	
	if(n==5) {
		
		return list1;
	}
	
	//for(int i=0 ;i<2;i++) {
		//System.out.println(i);
	list1=test(list,n+1);
	list1.add(list.get(n));
	//}
	return list1;
	
}
	
}
