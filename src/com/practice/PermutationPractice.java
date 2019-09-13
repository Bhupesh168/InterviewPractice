package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PermutationPractice {
	
	
	public static void main(String [] args) {
		ArrayList<String> permutedString = new ArrayList<String>();
		char[] array="ABC".toCharArray();
		
		PermutationPractice permute = new PermutationPractice();
		permute.permute(array, new char[3], 0,permutedString);
		System.out.println(permutedString);
		
	}

	public void permute(char[] finalArray,char[] ans,int callIndex,List<String> list) {
		
		if(finalArray.length==0) {
			System.out.println(new String(ans));
			list.add(new String(ans));
		
		
		}
		
	
		for(int i =0 ;i<finalArray.length;i++) {
			System.out.println("finalArray:"+new String(finalArray)+"  ans:"+new String(ans)+"  callIndex:"+callIndex+"  List:"+list);
			System.out.println("Index:"+i);
			ans[callIndex]=finalArray[i];
			char[] array=getArray(finalArray,i);
			permute(array,ans,callIndex+1,list);
			
		}
		
		
		
		
		
		
		
		
		
	}

	  private static char[] getArray(char[] callerArray, int index) {
	        if (callerArray.length == 1) {
	            return new char[]{};
	        }
	        char[] target = new char[callerArray.length - 1];
	        int tempIndex = 0;
	        for (int temp = 0; temp < callerArray.length; temp++) {
	            if (temp != index) {
	                target[tempIndex++] = callerArray[temp];
	            }
	        }
	        return target;
	    }
	
	
}
