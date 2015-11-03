package com.hr.ida.codility.lessons.lesson8;

//Prime and composite numbers
public class CountFactor {

	// 100%
	public int solution(int N) {

		if (N == 0)
			return 0;
		if (N == 1)
			return 1;
		int ret = 2;
		// i has to be long
		for (long i = 2; i * i <= N; i++) {
			if (N % i == 0) {
				if (i * i != N) {
					ret += 2;
				} else { // (i*i==N)
					ret += 1;
				}
			}
		}
		return ret;
	}
}
