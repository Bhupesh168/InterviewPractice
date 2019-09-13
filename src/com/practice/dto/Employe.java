package com.practice.dto;

import java.util.Comparator;
import java.util.List;



public class Employe implements Comparable<Employe> {
	
	
	public String name;
	public int score;
	public List list;
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Employe (String name , int score){
		this.name=name;
		this.score=score;
		
	}
	
	/*
	 * public String getName() { return name; } public void setName(String name) {
	 * this.name = name; } public int getScore() { return score; } public void
	 * setScore(int score) { this.score = score; }
	 */
	@Override
	public int compareTo(Employe a) {
		// TODO Auto-generated method stub
		
		
		
	    return -this.score - a.score;
	}
}
