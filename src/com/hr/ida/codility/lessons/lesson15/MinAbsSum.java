package com.hr.ida.codility.lessons.lesson15;

//Dynamic programming
public class MinAbsSum {
	
	//100%
	public int solution(int[] A) {
		int sum = 0;
		int validCount = 0;
		for (int i = 0; i < A.length; i++) {
			A[i] = Math.abs(A[i]);
			sum += A[i];
			if (A[i] != 0) {
				if (i != validCount) {
					A[validCount] = A[i];
				}
				validCount++;
			}
		}
		int res = backSack(A, validCount, sum / 2);
		return sum - res - res;
	}

	private int backSack(int[] A, int count, int sum) {
		int[] store = new int[sum + 1];
		for (int i = 0; i < count; i++) {
			for (int j = sum; j >= 0; j--) {
				if (j >= A[i]) {
					store[j] = Math.max(store[j], A[i] + store[j - A[i]]);
					if (store[j] == sum) {
						return sum;
					}
				}
			}
		}
		return store[sum];
	}

}
