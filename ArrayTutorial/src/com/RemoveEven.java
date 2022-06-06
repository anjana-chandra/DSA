package com;

public class RemoveEven {
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] removeElement(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				count++;
			}
		}
		int[] oddarr = new int[count];
		int k =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				oddarr[k] = arr[i];
				if(k == count) {
					return oddarr;
				}
				k++;
				
			}
		}
		return oddarr;
	}

}
