package com;

public class SubArrayNearestMax {

	public static void main(String[] args) {
		int[] arr = {2,1,2,6,4,5,1,5,2,6,4,3,4,1};
		int min = arr[0];
		int max = arr[0];
		int ans = arr.length;
		for(int i=1;i<arr.length;i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println("Nearest min and max");
		for(int i=0;i<arr.length;i++) {
			//once found min check next nearest max
			if(arr[i]==min) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==max) {
						ans = Math.min(ans,j-i+1);
						break;
					}
				}
			}else if(arr[i]==max) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]==min) {
						ans = Math.min(ans,j-i+1);
						break;
					}
				}
			}
		}
		System.out.println("min length of subarray = "+ans);
	}
	public static int min(int a, int b) {
		return (a<=b)? a: b;
	}
	public static int max(int a, int b) {
		return (a>=b)? a: b;
	}

}
