package com.hr.ida.codility.lessons.lesson7;

//Maximum slice problem
public class MaxSliceSum {
	
	public int solution(int[] A) {
		// for arrays with positive numbers
		/*
		  long max_slice = 0; 
		  long max_ending = 0; 
		  for (int i : A) { 
		  max_ending = Math.max(0, max_ending + i); 
		  max_slice = Math.max(max_slice, max_ending); 
		  } return (int)max_slice;
		 */

		// for arrays with negative numbers
		long max_ending_here = A[0];
		long max_so_far = A[0];
		for (int i = 1; i < A.length; i++) {
			max_ending_here = Math.max(A[i], max_ending_here + A[i]);
			max_so_far = Math.max(max_so_far, max_ending_here);
		}
		return (int) max_so_far;

		
	}

}
