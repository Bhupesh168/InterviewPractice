package com.practice;


	import java.util.ArrayList;
	import java.util.List;

	public class Permutation {

	    public static void main(String[] args) {
	        List<String> list = new ArrayList<>();
	        String abc = "abc";
	        permute(abc.toCharArray(), new char[abc.length()],0, list);
	        System.out.println(list);
	    }


	    private static void permute(char[] callerArray, char[] container, int callerIndex, List<String> list) {
	        System.out.println("BEGINNING FUNCTION CALL");
	    	if (callerArray.length==0) {
	            list.add(new String(container));
	        }
	        for (int index = 0; index < callerArray.length; index++) {
	            container[callerIndex] = callerArray[index];
	            char[] array = getArray(callerArray, index);
	            permute(array, container, callerIndex + 1, list);
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




