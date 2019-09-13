package com.practice;

import java.util.Comparator;

import com.practice.dto.Employe;

public class Compare implements Comparator<Employe> {
	@Override
	public int compare(Employe a, Employe b) {
		// TODO Auto-generated method stub
		
		if(a.score == b.score){

	        return a.name.compareTo(b.name);
	    }    

	    // Otherwise, order higher score first   
	    else if(a.score > b.score){
	        return -1;
	    }
	    else if(a.score < b.score){
	        return 1;
	    }
		
	    return 0;
	}
}
