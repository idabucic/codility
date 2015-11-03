package com.hr.ida.codility.lessons.lesson10;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

//Euclidean algorithm
public class CommonPrimeDivisors {

	// 100%
	public int solution(int[] A, int[] B) {
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			if (common(A[i], B[i])) {
				ans++;
			}
		}
		return ans;
	}

	private boolean common(int x, int y) {
		int d = gcd(x, y);
		return commonGCD(d, x) && commonGCD(d, y);
	}

	private boolean commonGCD(int x, int y) {
		int d = gcd(x, y);
		while (d != 1) {
			y /= d;
			d = gcd(x, y);
		}
		return x % y == 0;
	}

	private int gcd(int n, int m) {
		int r = n % m;
		while (r != 0) {
			n = m;
			m = r;
			r = n % m;
		}
		return m;
	}

	// 38%
	public int solution38a(int[] A, int[] B) {
		// Sieve of Eratosthenes
		int Z = A.length;
		int[] P = Arrays.copyOf(A, Z);
		int[] Q = Arrays.copyOf(B, Z);

		Arrays.sort(P);
		Arrays.sort(Q);
		int N = P[Z - 1];
		if (Q[Z - 1] > N) {
			N = Q[Z - 1];
		}
		N = N / 2 + 1;
		int count = 0;
		boolean[] sieve = new boolean[N + 1];
		Arrays.fill(sieve, Boolean.TRUE);
		sieve[0] = false;
		sieve[1] = false;
		for (int i = 2; i < (int) (Math.sqrt(N) + 1); i++) {
			if (sieve[i]) {
				for (int j = i + i; j <= N; j += i) {
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

		for (int i = 0; i < Z; i++) {
			int a = A[i];
			int b = B[i];
			int max = (a > b ? a : b);
			max = max / 2 + 1;
			if (a == b) {
				count++;
			} else {
				StringBuffer aSeq = new StringBuffer();
				StringBuffer bSeq = new StringBuffer();
				for (int j = 0; j < primes.size() && j < max; j++) {
					int prime = primes.get(j);
					if (a % prime == 0) {
						aSeq.append("1");
					} else {
						aSeq.append("0");
					}
					if (b % prime == 0) {
						bSeq.append("1");
					} else {
						bSeq.append("0");
					}
				}
				if (aSeq.toString().equals(bSeq.toString())) {
					count++;
				}
			}
		}

		return count;

	}

	// 38%
	public int solution38b(int[] A, int[] B) {
		// Sieve of Eratosthenes
		int Z = A.length;
		int[] P = Arrays.copyOf(A, Z);
		int[] Q = Arrays.copyOf(B, Z);

		Arrays.sort(P);
		Arrays.sort(Q);
		int N = P[Z - 1];
		if (Q[Z - 1] > N) {
			N = Q[Z - 1];
		}
		N = N / 2 + 1;
		int count = 0;
		boolean[] sieve = new boolean[N + 1];
		Arrays.fill(sieve, Boolean.TRUE);
		sieve[0] = false;
		sieve[1] = false;
		for (int i = 2; i < (int) (Math.sqrt(N) + 1); i++) {
			if (sieve[i]) {
				for (int j = i + i; j <= N; j += i) {
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

		for (int i = 0; i < Z; i++) {
			int a = A[i];
			int b = B[i];
			int max = (a > b ? a : b);
			max = max / 2 + 1;
			if (a == b) {
				count++;
			} else {
				boolean goOn = true;
				count++;
				while (goOn) {
					for (int j = 0; j < primes.size() && j < max; j++) {
						int prime = primes.get(j);
						if (a % prime == 0 && b % prime == 0 || a % prime != 0
								&& b % prime != 0) {
							continue;
						} else {
							goOn = false;
							count--;
							break;
						}
					}
					goOn = false;
				}

			}
		}

		return count;

	}

}
