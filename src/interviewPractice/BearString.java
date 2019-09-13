package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class BearString {
	public static void main(String [] args) {
		
		
	}
	
	static void checkString(String input) {
		
		char[] check=input.toCharArray();
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(int i=0;i<check.length;i++ ) {
			
			if(map.containsKey(check[i])) {
				
				map.put(check[i], map.get(check[i])+1);
			}
			
			else {
				
				map.put(check[i], 1);
			}
			
		}
		int result=0;
		char char1 = 0;
		Map <Character,Integer> map1=new HashMap<Character,Integer>();
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			
			if(entry.getValue()>check.length/4) {
				
				result=check.length/4>entry.getValue()?0:entry.getValue()-check.length/4;
				char1=entry.getKey();
				
			}
			map1.put(char1, result);
		}
		int pointer=0;
		int pointer1=0;
Map<Character,Integer> finalMap=new HashMap<Character,Integer>();
		for(int i =pointer1 ;i<check.length-1;i++) {
	
	
}

}
}
