package com;

public class RemoveDuplicate {
	 public static int removeDuplicates(int[] nums) {
	   if(nums.length == 0||nums.length==1)
		   return nums.length;
       int j=0;
      
       for(int i =1;i<nums.length;i++){
           if(nums[i]!=nums[j]){ // Only when it is not same as the previous unique element
               nums[++j] = nums[i];// Incrementing the index while assigning the new value
           }
       }
       System.out.println();
       for(int i: nums) {
    	   System.out.print(nums[i]+" ");
       }
       return j;
    }
}
