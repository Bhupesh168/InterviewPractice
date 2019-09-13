package com.practice;

import java.util.*;

class Solution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		Boolean valid = false;
		ArrayList<Character> list = new ArrayList<Character>();

		
		while (sc.hasNext()) {
			String input = sc.next();
			for (int i = 0; i < input.length(); i++) {
				
					list.add(input.charAt(i));
			
				if (input.charAt(i) == '}' && list.contains('{')) {

					list.remove(Character.valueOf('{'));
					list.remove(Character.valueOf('}'));
				}
					if (input.charAt(i) == ')' && list.contains('(')) {

						list.remove(Character.valueOf('('));
						list.remove(Character.valueOf(')'));
					}
					if (input.charAt(i) == ']' && list.contains('[')) {

						list.remove(Character.valueOf('['));
						list.remove(Character.valueOf(']'));
					}
                
				}
System.out.println(list.isEmpty());
			}
		}
	}

