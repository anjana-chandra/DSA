package com;

public class ReverseArr {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int i=2;
		int j = 5;
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println("reversed array");
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

}
