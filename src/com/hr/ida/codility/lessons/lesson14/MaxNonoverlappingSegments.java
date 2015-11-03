package com.hr.ida.codility.lessons.lesson14;

//Greedy algorithms
public class MaxNonoverlappingSegments {

	public int solution(int[] A, int[] B) {
		int count = 1;
		int n = A.length;
		if (n < 2)
			return n;
		int previousEnd = B[0];

		for (int i = 1; i < n; i++) {
			if (A[i] > previousEnd) {
				count++;
				previousEnd = B[i];
			}
		}

		return count;
	}

}
