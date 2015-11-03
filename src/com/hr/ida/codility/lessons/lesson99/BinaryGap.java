package com.hr.ida.codility.lessons.lesson99;

public class BinaryGap {

	// 100%
	public int solution(int N) {
		if (N < 5)
			return 0;
		int count = 0;
		String s = Integer.toBinaryString(N);
		int rest = 0;
		String rs = "";
		while (s.length() > 1 && N - Math.pow(2, s.length() - 1) > 0) {
			rest = (int) (N - Math.pow(2, s.length() - 1));
			rs = Integer.toBinaryString(rest);
			count = Math.max(count, s.length() - rs.length() - 1);
			s = rs;
			N = rest;
		}
		return count;
	}
}
