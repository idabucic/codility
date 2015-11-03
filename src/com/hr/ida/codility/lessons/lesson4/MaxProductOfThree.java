package com.hr.ida.codility.lessons.lesson4;

import java.util.Arrays;

//Sorting
public class MaxProductOfThree {
	// 100%
	public int solution(int[] A) {

		int n = A.length;
		if (n == 3)
			return A[0] * A[1] * A[2];
		Arrays.sort(A);

		// let it be calculated and then decided
		return Math.max(A[n - 3] * A[n - 2] * A[n - 1], A[0] * A[1] * A[n - 1]);
	}
	
}
