package com;

public class MinimumValue {
	public static int minimumValueOfArray(int[] arr) {
		int max = arr[0];
		for(int i: arr) {
			if(i>max)
				max = i;
		}
		return max;
	}

}
