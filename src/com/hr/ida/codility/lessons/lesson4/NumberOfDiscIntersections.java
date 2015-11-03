package com.hr.ida.codility.lessons.lesson4;

import java.util.Arrays;

//Sorting
public class NumberOfDiscIntersections {

	// 87%
	public int solution(int[] A) {
		if (A == null || A.length < 2) {
			return 0;
		}

		int[] B = Arrays.copyOf(A, A.length);
		Arrays.sort(B);
		int biggest = B[A.length - 1];
		int intersections = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (j - biggest > i + A[i]) {
					break;
				}
				if (j - A[j] <= i + A[i]) {
					intersections++;
				}
				if (intersections > 10000000) {
					return -1;
				}
			}
		}

		return intersections;
	}
}
