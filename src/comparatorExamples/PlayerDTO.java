package comparatorExamples;

import java.util.Comparator;

public class PlayerDTO implements Comparable<PlayerDTO>{
	
	 String name;
	  int score;
	 
	 PlayerDTO(String name , int score){
		 this.name=name;
		 this.score=score;
		 
	 }

	

	@Override
	public int compareTo(PlayerDTO o) {
		// TODO Auto-generated method stub
		
		return o.name.compareTo(this.name);
	}

}
