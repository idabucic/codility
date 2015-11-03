package com.hr.ida.codility.lessons.lesson10;

import java.util.Arrays;

//Euclidean algorithm
public class ChocolatesByNumbers {

	// 100%
	// solution is lcm/M
	// because we reach the same position (position 0) at lcm
	// lcm = N*M/gcd
	// solution = N*M/gcd*M = N/gcd
	public int solution(int N, int M) {
		int initialN = N;
		// gdc
		int rest = N % M;
		while (rest != 0) {
			N = M;
			M = rest;
			rest = N % M;
		}
		return initialN / M;
	}

	// 62%
	public int solution62(int N, int M) {
		int count = 0;
		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		boolean[] chocolates = new boolean[N];
		Arrays.fill(chocolates, true);
		int i = 0;
		while (chocolates[i]) {
			count++;
			chocolates[i] = false;
			i = i + M;
			if (i >= N) {
				i = i % N;
			}
		}
		return count;
	}

}
