package com.hr.ida.codility.lessons.lesson11;

import java.util.Arrays;

//Fibonacci numbers
public class FibFrog {
	
	//100%
	public int solution(int[] A) {
		int n = A.length;
		int[] fib = new int[26];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < 26; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		int[] dp = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			dp[i] = -1;
			if (i < n && A[i] == 0)
				continue;
			if (Arrays.binarySearch(fib, i + 1) >= 0) {
				dp[i] = 1;
				continue;
			}
			for (int j = 1; j < 26; j++) {
				if (i - fib[j] < 0)
					break;
				if (dp[i - fib[j]] == -1)
					continue;
				if (dp[i] == -1)
					dp[i] = dp[i - fib[j]] + 1;
				else
					dp[i] = Math.min(dp[i], dp[i - fib[j]] + 1);
			}
		}
		return dp[n];
	}

}
