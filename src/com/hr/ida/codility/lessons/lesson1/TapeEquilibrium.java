package com.hr.ida.codility.lessons.lesson1;

//Time Complexity
public class TapeEquilibrium {

	// 100%
	public int solution(int A[]) {
		int n = A.length;
		if (n == 1) {
			return A[0];
		}
		int[] prefSum = new int[n + 1];
		prefSum[0] = 0;
		for (int i = 1; i < n + 1; i++) {
			prefSum[i] = prefSum[i - 1] + A[i - 1];
		}
		int minDiff = 1000000;
		for (int j = 1; j < n; j++) {
			int secondPart = prefSum[n] - prefSum[j];
			int diff = Math.abs(prefSum[j] - secondPart);
			if (diff < minDiff) {
				minDiff = diff;
			}
		}
		return minDiff;
	}
}
