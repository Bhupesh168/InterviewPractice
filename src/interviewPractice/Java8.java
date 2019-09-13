package interviewPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {
	
	
 public static void main(String args[]) {
	 
	 Predicate<Integer> p = (n) -> (  n == 5);
	 
	 List<Integer> list = new ArrayList<Integer>();
	 
	 list.add(1);
	 list.add(2);
	 list.add(3);
	 list.add(5);
	// List<Integer> list1 = new ArrayList<Integer>();
	 
	List list1= list.stream().filter(p).collect(Collectors.toList());
	A a = new A();
	Map<String,Integer> map= new HashMap<String,Integer>();
	map.put("a", 1);
	map.put("b", 3);
	map.put("c", 2);
	
	
	
	System.out.println(list1);
	 
	 
	 
 }
	
	
	

}
