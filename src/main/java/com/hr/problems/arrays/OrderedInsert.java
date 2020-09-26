package com.hr.problems.arrays;

import com.hr.problems.util.PrintUtil;

public class OrderedInsert {
	
	public static void orderedInsert(int[] array, int item) {
		
	}
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		orderedInsert(arr, 20);
		orderedInsert(arr, 12);
		orderedInsert(arr, 14);
		orderedInsert(arr, 8);
		orderedInsert(arr, 10);
		orderedInsert(arr, 18);
		orderedInsert(arr, 16);
		
		PrintUtil.printArray(arr);
	}
}
