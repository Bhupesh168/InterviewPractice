package interviewPractice;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Race {
	
	
	public static void main(String [] args) {
		Scanner s= new Scanner(System.in);
		int hills=s.nextInt();
		int roads=s.nextInt();
	LinkedList<Integer> list = new LinkedList<Integer>();
	LinkedList<Integer> list1=new LinkedList<Integer>();
	LinkedHashMap<Integer,Integer> map= new LinkedHashMap<Integer,Integer>();
	s.nextLine();	
	for(int i=0 ;i<roads;i++) {
			list.add(s.nextInt());
			list1.add(s.nextInt());
			map.put(s.nextInt(), s.nextInt());
			
			s.nextLine();
		}
	int count =0 ;
LinkedHashMap<Integer,Integer> map1 = new LinkedHashMap<Integer,Integer>();
	for(int j=0;j<hills;j++) {
		
		for(int k=j ;k<hills;k++) {
			if(list.get(j)==list1.get(k)) {
				
				break;
			}
			count++;
		}
		
		map1.put(list.get(j),count);
		count=0;
	}
	
	s.close();
		System.out.println(map1);
	}

}
