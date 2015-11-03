package com.hr.ida.codility.lessons.lesson3;

//Prefix Sums
public class PassingCars {
	//100%
	public int solution(int[] A) {
		long sum = 0;
		int[] prefSum = new int[A.length + 1];
		for (int i = 1; i <= A.length; i++) {
			prefSum[i] = prefSum[i - 1] + A[i - 1];
		}

		for (int j = 0; j < A.length; j++) {
			if (A[j] == 0 && sum <= 1000000000) {
				int num = prefSum[A.length] - prefSum[j];
				sum += (long) num;
			} else if (sum > 1000000000) {
				sum = -1;
				break;
			}
		}

		return (int) sum;
	}
}
