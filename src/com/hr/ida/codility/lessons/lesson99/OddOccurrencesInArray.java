package com.hr.ida.codility.lessons.lesson99;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

	//100%
	public int solution(int[] A) {
		int n = A.length;
		if (n == 1)
			return A[0];
		int ret = 0;
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			if (s.add(A[i])) {
				continue;
			} else {
				// already has A[i], that is even number of times that A[i] is
				// appearing in array
				s.remove(A[i]);
				continue;
			}
		}
		if (s.size() > 0) {
			for (Integer integer : s) {
				ret = integer;
			}
		}
		return ret;
	}
}
