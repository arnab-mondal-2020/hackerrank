package com.hr.problems.arrays;

import com.hr.problems.util.PrintUtil;

public class ArrayManipulation {
	static long arrayManipulation(int n, int[][] queries) {
		long[] zeros = new long[n];
		long[] differenceArray = new long[n];

		for (int i = 0; i < queries.length; i++) {
			int[] query = queries[i];
			int start = query[0] - 1;
			int end = query[1] - 1;
			int operateBy = query[2];

			differenceArray[start] += operateBy;
			
			if (end < n - 1) {
				differenceArray[end + 1] -= operateBy;
			}
		}
		zeros[0] = differenceArray[0];
		long largestNumber = zeros[0];
		PrintUtil.printArray(zeros);
		
		for (int i = 1; i < n; i++) {
			zeros[i] = zeros[i -1] + differenceArray[i];
			if (zeros[i] > largestNumber) {
				largestNumber = zeros[i];
			}
		}
		PrintUtil.printArray(zeros);
		return largestNumber;
	}
	
	public static void main(String[] args) {
		int[][] queries = {{1, 2, 100}, {2, 3, 100}, {1, 5, 150}};
		System.out.println(arrayManipulation(5, queries));
	}
}
