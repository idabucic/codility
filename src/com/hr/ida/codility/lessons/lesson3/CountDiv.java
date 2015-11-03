package com.hr.ida.codility.lessons.lesson3;

//Prefix Sums
public class CountDiv {
	// 100%
	public int solution(int A, int B, int K) {
		if (A == B) {
			if (A % K == 0) {
				return 1;
			} else {
				return 0;
			}
		}
		double divisorsInB = Math.floor((double) B / K);
		double divisorsInA = Math.floor((double) A / K);
		if (A % K == 0) {
			divisorsInB++;
		}
		return ((int) (divisorsInB - divisorsInA));
	}
}
