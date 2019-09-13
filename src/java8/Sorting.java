package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
public static void main(String [] args) {
	
	List<Model> list= new ArrayList<Model>();
	list.add(new Model(1,"k"));
	list.add(new Model(1,"a"));
	list.add(new Model(5,"c"));
	Comparator<Model> c= ( o1,o2)->{ 
		if( o1.getId()-o2.getId()==0) {
		return o1.getName().compareTo(o2.getName());
	}
	return o1.getId()-o2.getId();
	};

	
/*new Comparator<Model>() {

		@Override
		public int compare(Model o1, Model o2) {
			// TODO Auto-generated method stub
		if( o1.getId()-o2.getId()==0) {
			return o1.getName().compareTo(o2.getName());
		}
		return o1.getId()-o2.getId();
		}
		
	};
*/	
	List<Model> sortedList=list.stream().sorted(c).collect(Collectors.toList());
	System.out.println(sortedList.get(0).id+"  "+sortedList.get(0).name);
	
Test t	=new Test() {

		@Override
		public int  add(int i, int j) {
			return i+j;
			
			
		}
		
	};
	
	System.out.println(t.add(2,3));
}
	
	
	

}
