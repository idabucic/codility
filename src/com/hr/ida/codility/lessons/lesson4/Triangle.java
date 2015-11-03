package com.hr.ida.codility.lessons.lesson4;

import java.util.Arrays;

//Sorting
public class Triangle {

	// 100%
	public int solution(int[] A) {
		int res = 0;
		Arrays.sort(A);
		for (int i = 0; i < A.length - 2; i++) {
			if (((long) A[i] + (long) A[i + 1]) > (long) A[i + 2]) {
				res = 1;
				break;
			}
		}
		return res;
	}
}
