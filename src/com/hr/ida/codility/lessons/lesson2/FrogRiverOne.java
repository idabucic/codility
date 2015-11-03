package com.hr.ida.codility.lessons.lesson2;

import java.util.Set;
import java.util.HashSet;

public class FrogRiverOne {
	public int solution(int X, int[] A) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= X) {
				s.add(A[i]);
			}
			if (s.size() == X) {
				return i;
			}
		}

		return -1;
	}
}
