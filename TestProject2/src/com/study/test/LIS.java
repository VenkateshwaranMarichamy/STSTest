package com.study.test;

import java.util.Arrays;

public class LIS {
	 int count=1;
	 int flag = 0;
	 public int lengthOfLIS(int[] arr) {
	       
		 int[] resultarr = new int[arr.length];
		 Arrays.fill(resultarr,1);
		 System.out.println("input array "+Arrays.toString(arr));
		 if(arr.length==1) {
			 flag=-1;
			 return flag;
		 }
		 for(int i=0; i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 if(arr[j]>arr[i]) {
					 count =count+1;
				 }
				// System.out.println(flag);
				 
				 flag = lengthOfLIS(getSlice(arr, j, arr.length));
				 if(flag==-1) {
					 if(count>resultarr[i]) {
					 resultarr[i]=count;
					 count=1;
					 flag=0;
					 }
				 }
				 
			 }
			 
		 }
		 System.out.println(Arrays.toString(resultarr));
		 return maxElement(resultarr);
	    }
	 
	 public int maxElement(int[] a) {
		 int max = a[0];
	        for(int i = 0; i < a.length; i++)
	        {
	            if(max < a[i])
	            {
	                max = a[i];
	            }
	        }
	        return max;
	 }
	 
	 public static int[] getSlice(int[] array, int startIndex, int endIndex)   
	 {   
	 // Get the slice of the Array   
	 int[] slicedArray = new int[endIndex - startIndex];   
	 //copying array elements from the original array to the newly created sliced array  
	 for (int i = 0; i < slicedArray.length; i++)   
	 {   
	 slicedArray[i] = array[startIndex + i];   
	 }   
	 //returns the slice of an array  
	 return slicedArray;   
	 }   

	public static void main(String[] args) {
		
		LIS l= new LIS();
		System.out.println("Result "+l.lengthOfLIS(new int[]{1,2,4,3}));
	}

}
