package com.hr.ida.codility.lessons.lesson9;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

//Sieve of Eratosthenes
public class CountSemiprimes {
	//100%
	public int[] solution(int N, int[] P, int[] Q) {
		// Sieve of Eratosthenes
		boolean[] sieve = new boolean[N + 1];
		Arrays.fill(sieve, Boolean.TRUE);
		sieve[0] = false;
		sieve[1] = false;
		for (int i = 2; i < (int) (Math.sqrt(N) + 1); i++) {
			if (sieve[i]) {
				for (int j = i + i; j < N; j += i) {
					sieve[j] = false;
				}
			}
		}
		// prime numbers
		List<Integer> primes = new ArrayList<Integer>();
		for (int i = 0; i < sieve.length; i++) {
			if (sieve[i]) {
				primes.add(i);
			}
		}
		int[] semiprimes = new int[N + 1];
		long semiprime = 0;
		for (int i = 0; i < primes.size(); i++) {
			for (int j = i; j < primes.size(); j++) {
				semiprime = (long) primes.get(i) * (long) primes.get(j);
				if (semiprime > N) {
					break;
				}
				semiprimes[(int) semiprime] = 1;
			}
		}
		// prefix sums
		for (int i = 1; i < semiprimes.length; i++) {
			semiprimes[i] += semiprimes[i - 1];
		}
		int[] count = new int[Q.length];
		for (int i = 0; i < Q.length; i++) {
			count[i] = semiprimes[Q[i]] - semiprimes[P[i] - 1]; 
		}
		return count;

	}
}
