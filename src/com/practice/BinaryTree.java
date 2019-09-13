package com.practice;

import java.util.Scanner;

public class BinaryTree {

	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int i = 0;
		int count = s.nextInt();
		int left = 0;
		int right = 0;
		int root = s.nextInt();
		int rightNode = 0;
		int leftNode = 0;
		while (i < count - 1) {
			int value = s.nextInt();
		
			if (value <= root && left==0) {
				leftNode++;
				left =1;
				right = 0;
			} else if(value > root && right==0) {

				right = 1;
				left = 0;
				rightNode++;
				
			}
			else {
				if(value > root) {
					rightNode++;
				right=0;
				}
				else {
					leftNode++;
					left=0;
				}
					root=value;	
			}
			count--;
		}
		System.out.print(Math.max(leftNode + 1, rightNode + 1));
	}

}
