package com.hr.ida.codility.lessons.lesson13;

import java.util.Arrays;

//Caterpillar method
public class MinAbsSumOfTwo {

	// 100%
	public int solution(int[] A) {
		int n = A.length;
		if (n == 0)
			return 0;
		if (n == 1)
			return Math.abs(2 * A[0]);
		int minSum = Integer.MAX_VALUE;
		Arrays.sort(A);
		if (A[n - 1] < 0 || A[n - 1] == 0)
			return Math.abs(2 * A[n - 1]);
		if (A[0] > 0 || A[0] == 0)
			return Math.abs(2 * A[0]);

		// numbers < 0
		int left = 0;
		// numbers > 0
		int right = n - 1;
		while (left <= right && A[left] <= 0) {
			minSum = Math.min(minSum, Math.abs(A[left] + A[right]));
			if (Math.abs(A[left]) > A[right]) {
				left++;
			} else if (Math.abs(A[left]) < A[right]) {
				right--;
			} else if (Math.abs(A[left]) == A[right]) {
				return 0;
			}
		}
		return minSum;

	}

	// 45%
	public int solution45(int[] A) {
		int n = A.length;
		if (n == 0)
			return 0;
		if (n == 1)
			return Math.abs(2 * A[0]);
		int minSum = Integer.MAX_VALUE;
		int lastIndex = 0;
		for (int i = 0; i < n; i++) {
			lastIndex = i;
			while (lastIndex < n) {
				minSum = Math.min(minSum, Math.abs(A[i] + A[lastIndex]));
				lastIndex++;
			}
		}

		return minSum;
	}

}
