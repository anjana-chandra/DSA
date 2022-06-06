package com;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,1,1,2,3,3,4,4,5,6};
		//int k = RemoveDuplicate.removeDuplicates(arr);
		System.out.println(countOfelements(arr,arr.length));
	//	System.out.println("Minimum Value = "+k);
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int countOfelements(int arr[],int n)
	{
		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==max) {
				count++;
			}
		}
		return n-count;
	}
}
