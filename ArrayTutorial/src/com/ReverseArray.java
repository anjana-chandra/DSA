package com;

public class ReverseArray {
	public static int[] reverse(int[] arr) {
		//int[] arr = {4,0,6,7,8};
		int start = 0;
		int end = arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;		
			start++;
			end--;			
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
