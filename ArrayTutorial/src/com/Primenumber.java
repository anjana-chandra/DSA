package com;

public class Primenumber {

	public static void main(String[] args) {
		int n = 31;
		System.out.println(isCheckPrime(n));

	}
	
	public static boolean isCheckPrime(int n) {
		int count=0;
		for(int i=1;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				if((n/i)==i) {
					count++;
				}else {
					count+=2;
				}
			}
		}
		System.out.println(count);
		if(count == 1) {
			return true;
		}else {
			return false;
		}
	}

}
