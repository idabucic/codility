package com.hr.ida.codility.lessons.lesson15;


//Dynamic programming
public class NumberSolitaire {
	public int solution(int[] A) {
		int n = A.length;
		if (n == 2)
			return A[0] + A[1];

		int[] maxValue = new int[n];
		// initialize the each cell with INT_MIN except the first one
		maxValue[0] = A[0];
		for (int i = 1; i < n; i++) {
			maxValue[i] = Integer.MIN_VALUE;
		}

		// do dynamic programming for jump
		for (int pos = 0; pos < n - 1; pos++) {

			// throw the dice (1-6)
			for (int j = 1; j <= 6; j++) {
				// if out of range, neglect
				int jumpPosition = pos + j;

				// not to jump out of the range
				if (jumpPosition >= n) {
					continue;
				}

				// update each cell's max value
				int tmp = A[jumpPosition] + maxValue[pos];
				maxValue[jumpPosition] = maxValue[jumpPosition] < tmp ? tmp : maxValue[jumpPosition];
			}
		}

		return maxValue[n - 1];
	}
}
