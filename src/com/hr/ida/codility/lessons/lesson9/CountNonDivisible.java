package com.hr.ida.codility.lessons.lesson9;

import java.util.Arrays;


//Sieve of Eratosthenes
public class CountNonDivisible {
	//100%
	public int[] solution(int[] A) {
		// A={3,1,2,3,6};
		int n = A.length;
		if (n == 1)
			return new int[] { 0 };

		int[] B = Arrays.copyOf(A, n);
		Arrays.sort(B);
		// B={1,2,3,3,6};
		int max = B[n - 1];
		// max number = 6
		int[] count = new int[n];

		// modified sieve, counts how many divisors each number in array A has
		int[] sieve = new int[max + 1];
		for (int i = 0; i < n; i++) {
			int x = B[i];
			for (int j = x; j <= max; j += x) {
				sieve[j]++;
			}
		}
		// i= 0,1,2,3,4,5,6
		// sieve={0,1,2,3,2,1,5}

		for (int i = 0; i < n; i++) {
			count[i] = n - sieve[A[i]];
		}

		return count;
	}
}
