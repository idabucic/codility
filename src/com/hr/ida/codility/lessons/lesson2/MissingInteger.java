package com.hr.ida.codility.lessons.lesson2;

public class MissingInteger {
	
	public int solution(int[] A) {
		int len = 100000;
		if (A.length < 100000) {
			len = A.length;
		}
		int[] counters = new int[len];

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0 && A[i] <= len) {
				counters[A[i] - 1] = 1;
			}
		}

		for (int j = 0; j < counters.length; j++) {
			if (counters[j] == 0) {
				return j + 1;
			}
		}
		return A.length + 1;
	}
}
