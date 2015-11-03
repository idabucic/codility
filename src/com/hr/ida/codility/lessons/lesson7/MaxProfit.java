package com.hr.ida.codility.lessons.lesson7;

//Maximum slice problem
public class MaxProfit {
	// 100%
	public int solution(int[] A) {
		int result = 0;
		int n = A.length;

		if (n == 0 || n == 1) {
			return 0;
		}
		int[] profit = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			profit[i] = A[i + 1] - A[i];
		}
		result = profit[0];
		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			if (sum > 0) {
				sum += profit[i];
			} else {
				sum = profit[i];
			}
			result = Math.max(result, sum);
		}
		if (result < 0)
			result = 0;
		return result;
	}
}
