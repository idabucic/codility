package com.hr.ida.codility.lessons.lesson1;

//Time Complexity
public class PermMissingElem {

	// 100%
	public int solution(int[] A) {
		// variables have to be long, not int
		long n = A.length;
		if (n == 1) {
			if (A[0] == 1) {
				return 2;
			} else if (A[0] == 2) {
				return 1;
			}
		}
		long sum = (n + 1) * (n + 2) / 2;
		long actualSum = 0;
		for (int i = 0; i < n; i++) {
			actualSum += A[i];
		}
		return ((int) (sum - actualSum));
	}
}
