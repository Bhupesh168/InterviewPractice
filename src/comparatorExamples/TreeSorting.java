package comparatorExamples;

import java.util.ArrayList;
import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeSorting {
	
	 static Map<PlayerDTO,Integer> map= new HashMap<PlayerDTO,Integer>();
	static List<Integer> list= new ArrayList<Integer>();
	static List<PlayerDTO> list1= new ArrayList<PlayerDTO>();
	public static void main(String args[]) {
		
	map.put(new PlayerDTO("a",1),1);
	map.put(new PlayerDTO("c",3),3);
	map.put(new PlayerDTO("b",2),2);
		System.out.println(new TreeMap(map));
		list.add(5);
		list.add(3);
		list.add(10);
		Collections.sort(list,new CustomComparator());
		System.out.println(list);
	list1.add(new PlayerDTO("d",5));
	list1.add(new PlayerDTO("a",1));
	list1.add(new PlayerDTO("b",2));
	list1.add(new PlayerDTO("c",3));
	Collections.sort(list1);
		for(PlayerDTO player: list1) {
			System.out.println(player.name);
			
			
		}
		
	}
	
	

}
