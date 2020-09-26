package com.hr.problems.util;

public interface PrintUtil {
	
	public static void printArray(long[] arr) {
		System.out.println(buildStringFromArray(arr));
	}
	
	public static void print2DArray(long[][] arr) {
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < arr.length; i++) {
			sb.append(buildStringFromArray(arr[i]));
			sb.append("\n");
		}
		sb.append("]");
	}
	public static void printArray(int[] arr) {
		System.out.println(buildStringFromArray(arr));
	}
	
	public static void print2DArray(int[][] arr) {
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < arr.length; i++) {
			sb.append(buildStringFromArray(arr[i]));
			sb.append("\n");
		}
		sb.append("]");
	}
	
	static String buildStringFromArray(long[] arr) {
		StringBuilder sb = new StringBuilder("{") ;
		for(int i = 0; i < arr.length; i++) {
			if(i != 0) {
				sb.append(",").append(" ");
			}
			sb.append(arr[i]);
		}
		sb.append("}");
		
		return sb.toString();
	}
	static String buildStringFromArray(int[] arr) {
		StringBuilder sb = new StringBuilder("{") ;
		for(int i = 0; i < arr.length; i++) {
			if(i != 0) {
				sb.append(",").append(" ");
			}
			sb.append(arr[i]);
		}
		sb.append("}");
		
		return sb.toString();
	}
}
