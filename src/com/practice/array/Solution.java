package com.practice.array;

public class Solution {
	public int coverPoints(int[] A, int[] B) {

		int sum = 0;

		int x = A[0];
		int y = B[0];

		for (int i = 1; i < A.length; i++) {
			sum += Math.max(Math.abs(A[i] - x), Math.abs(B[i] - y));
			x = A[i];
			y = B[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().coverPoints(new int[] {4, 8, -7, -5, -13, 9, -7, 8}, new int[] {4, -15, -10, -3, -13, 12, 8, -8}));
	System.out.println(Math.abs(8));
	}
}
