package com;

public class NearestMinMaxOpt {

	public static void main(String[] args) {
		int[] arr = {2,2};
		int min = arr[0];
		int max = arr[0];
		int ans = arr.length;
		for(int i=1;i<arr.length;i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);
		int minI = -1;
		int maxI = -1;
		int l = 0;
		for(int i=arr.length-1;i>=0;i--) {
			if(min == max) {
				ans = 1;
				break;
			}
			if(arr[i]==min) {
				minI = i;
				l = Math.abs(minI-maxI)+1;
				ans = Math.min(ans,l);
			}else if(arr[i]==max) {
				maxI = i;
				l = Math.abs(minI-maxI)+1;
				ans = Math.min(maxI, l);
			}
		}
		System.out.println("length of minsubarray with min and max = "+ans);
	}

}
