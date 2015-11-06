package com.hr.ida.codility.lessons.lesson2;

import java.util.Arrays;

//Counting Elements
public class MaxCounters {

	// 100% 
	public int[] solutionUpgrade(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		int maxToSet = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == N + 1) {
				maxToSet = max;
			} else {
				if (counters[A[i] - 1] < maxToSet) {
					counters[A[i] - 1] = 1 + maxToSet;
				} else {
					counters[A[i] - 1] = counters[A[i] - 1] + 1;
				}
				if (max < counters[A[i] - 1]) {
					max = counters[A[i] - 1];
				}
			}
		}
		for (int j = 0; j < N; j++) {
			if (counters[j] < maxToSet) {
				counters[j] = maxToSet;
			}
		}
		return counters;
	}

	// 77%, O(n*m)
	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= N) {
				counters[A[i] - 1]++;
				if (max < counters[A[i] - 1]) {
					max = counters[A[i] - 1];
				}
			} else {
				Arrays.fill(counters, max);
			}
		}
		return counters;
	}

}
