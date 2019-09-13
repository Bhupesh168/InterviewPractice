package com.practice;

public class NumberOfBinaryTree {
	
	public static void main(String [] args) {
		NumberOfBinaryTree number = new NumberOfBinaryTree();
	System.out.println(number.numTrees(3));
	}
	    public int numTrees(int a) {
	        int[] sol = new int[a+1];
	        sol[0]=1;
	        sol[1]=1;
	        for(int i=2;i<=a;i++){
	            for(int j=1;j<=i;j++){
	                sol[i] += sol[j-1]*sol[i-j];
	            }
	        }
	        return sol[a];
	    }
	} 


