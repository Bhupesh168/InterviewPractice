package comparatorExamples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

public class MapSorting {
	
	static Map<String,Integer> map= new HashMap<String,Integer>();
	public static void main(String [] args) {
		
		AtomicBoolean execute=new AtomicBoolean(); 
		System.out.println(execute.get());
		
		
		map.put("d", 4);
		map.put("a" ,1);
		map.put("c", 3);
		map.put("b", 2);
		
		List<Map.Entry<String,Integer>> list= new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		
	
	//	map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.to);
		
		
		
	}
	
	
	
	

}
