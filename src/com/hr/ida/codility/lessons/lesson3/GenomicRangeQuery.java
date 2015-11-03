package com.hr.ida.codility.lessons.lesson3;

import java.util.List;
import java.util.ArrayList;

//Prefix Sums
public class GenomicRangeQuery {
	// 75%
	public int[] solution(String S, int[] P, int[] Q) {

		int[] sol = new int[P.length];
		List<Integer> A = new ArrayList<Integer>();
		List<Integer> C = new ArrayList<Integer>();
		List<Integer> G = new ArrayList<Integer>();
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == 'A') {
				A.add(i);
			} else if (c == 'C') {
				C.add(i);
			} else if (c == 'G') {
				G.add(i);
			}

		}

		for (int i = 0; i < P.length; i++) {
			boolean found = false;

			for (int j = 0; j < A.size(); j++) {
				if (A.get(j) > Q[i])
					break;
				if (A.get(j) <= Q[i] && A.get(j) >= P[i]) {
					sol[i] = 1;
					found = true;
					break;
				}
			}
			if (!found) {
				for (int j = 0; j < C.size(); j++) {
					if (C.get(j) > Q[i])
						break;
					if (C.get(j) <= Q[i] && C.get(j) >= P[i]) {
						sol[i] = 2;
						found = true;
						break;
					}
				}
			}
			if (!found) {
				for (int j = 0; j < G.size(); j++) {
					if (G.get(j) > Q[i])
						break;
					if (G.get(j) <= Q[i] && G.get(j) >= P[i]) {
						sol[i] = 3;
						found = true;
						break;
					}
				}
			}
			if (!found) {
				sol[i] = 4;
			}

		}

		return sol;
	}

}
