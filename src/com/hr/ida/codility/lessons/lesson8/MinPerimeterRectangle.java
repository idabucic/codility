package com.hr.ida.codility.lessons.lesson8;

//Prime and composite numbers
public class MinPerimeterRectangle {
	// 100%
	public int solution(int N) {
		if (N == 0)
			return 0;
		if (N == 1)
			return 4;
		long min = (long) N * 2 + 1 * 2;
		// i has to be long
		for (long i = 2; i * i <= N; i++) {
			if (N % i == 0) {
				if (i * i != N) {
					min = Math.min(min, (2 * i + 2 * N / i));
				} else { // (i*i==N)
					min = Math.min(min, 4 * i);
				}
			}
		}
		return (int) min;
	}

}
