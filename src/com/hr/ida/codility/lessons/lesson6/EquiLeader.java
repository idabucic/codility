package com.hr.ida.codility.lessons.lesson6;

import java.util.Stack;

//Leader
public class EquiLeader {

	// 100%
	public int solution(int[] A) {
		int ret = 0;
		long candidate = 0l;
		int counter = 0;
		if (A.length == 0 || A.length == 1) {
			return 0;
		}
		Stack<Long> s = new Stack<Long>();
		s.push((long) A[0]);
		for (int i = 1; i < A.length; i++) {
			if (s.size() > 0) {
				if ((long) A[i] != ((long) s.peek())) {
					s.pop();
				} else {
					s.push((long) A[i]);
				}
			} else {
				s.push((long) A[i]);
			}
		}
		if (s.size() != 0) {
			candidate = s.pop();
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate) {
				counter++;
			}
		}
		if (counter < A.length / 2) {
			// no dominator in array
			return 0;
		}

		// i am skiping a step of creating an array that has 1s in the places of
		// dominator and 0s in all the other places
		// creating prefix sum for that array
		int[] prefSum = new int[A.length + 1];
		prefSum[0] = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate) {
				prefSum[i + 1] = prefSum[i] + 1;
			} else {
				prefSum[i + 1] = prefSum[i];
			}
		}

		// countig equileaders
		for (int i = 1; i <= A.length - 1; i++) {
			if ((float) prefSum[i] / i > 0.5f
					&& (float) (prefSum[A.length] - prefSum[i])
							/ (A.length - i) > 0.5f) {
				ret++;
			}
		}

		return ret;
	}
}
