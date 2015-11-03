package com.hr.ida.codility.lessons.lesson12;

//Binary search algorithm
public class MinMaxDivision {
	public int solution(int K, int M, int[] A) {
		int n = A.length;
		int[] prefsum = new int[n + 1];
		int maxNumber = 0;

		prefsum[0] = 0;
		for (int i = 1; i <= n; i++) {
			prefsum[i] = prefsum[i - 1] + A[i - 1];
			maxNumber = Math.max(maxNumber, A[i - 1]);

		}

		int left = maxNumber, right = prefsum[n];
		while (left <= right) {
			int mid = (left + right) / 2;
			int intervals = countIntervals(A, mid);
			if (intervals > K) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return left;

	}

	private int countIntervals(int[] A, int target) {
		int sum = 0, count = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			if (sum > target) {
				count++;
				sum = A[i];
			}
		}
		return count + (sum > 0 ? 1 : 0);
	}

}
