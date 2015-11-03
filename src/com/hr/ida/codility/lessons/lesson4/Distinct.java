package com.hr.ida.codility.lessons.lesson4;

import java.util.HashSet;
import java.util.Set;

//Sorting
public class Distinct {

	// 100%
	public int solution(int[] A) {
		int size = 0;
		Set<Integer> s = new HashSet<Integer>();
		for (int i : A) {
			s.add(i);
		}
		size = s.size();
		return size;
	}
}
