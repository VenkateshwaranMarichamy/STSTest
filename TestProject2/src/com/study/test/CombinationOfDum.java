package com.study.test;

import java.util.Arrays;

public class CombinationOfDum {
	
	
	
	public static int combinationSum4(int[] nums, int target,Integer[] qb) {
		
		
		 if(target == 0){
	            return 1;
	        }
	        if(target<0){
	            return 0;
	        }
	        
	        if(qb[target]!=null){
	            return qb[target];
	        }
	        
	        int count = 0 ;
	        for(int i=0; i<nums.length; i++){
	        	System.out.println( "i :"+i+" NUM:"+nums[i]+" target:"+(target-nums[i])+" count:"+count);
	           count+= combinationSum4(nums, target-nums[i],qb);
	        }
	        System.out.println(Arrays.toString(qb));
	        return qb[target] = count;
    }

	public static void main(String[] args) {
	
		System.out.println(combinationSum4(new int[]{1,2,3},4,new Integer[8]));

	}

}
