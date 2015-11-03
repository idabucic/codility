package com.hr.ida.codility.lessons.lesson11;

import java.util.Arrays;

//Fibonacci numbers
public class Ladder {

	// 100%
	public int[] solution(int[] A, int[] B) {
		int l = A.length;
		int[] sortedA = Arrays.copyOf(A, l);
		Arrays.sort(sortedA);
		int maxDistance = sortedA[l - 1];
		int[] dp = new int[maxDistance + 1];
		dp[0] = 1;
		dp[1] = 1;
		int[] ret = new int[l];

		// we need to calculate number of different ways of climbing the ladder
		// only once
		// and for the biggest number in array A
		for (int i = 2; i < maxDistance + 1; i++) {
			for (int j = 1; j <= 2; j++) {
				// to make sure the number will not exceed the max integer in
				// java
				dp[i] += dp[i - j] % (1 << 30);
			}
		}

		for (int x = 0; x < l; x++) {
			ret[x] = dp[A[x]] % (1 << B[x]);
			// or dp[A[x]] & ((1<<B[i])-1)
		}

		return ret;

	}

}
