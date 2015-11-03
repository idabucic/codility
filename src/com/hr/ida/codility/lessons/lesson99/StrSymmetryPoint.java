package com.hr.ida.codility.lessons.lesson99;

public class StrSymmetryPoint {
	
	// 100%
	public int solution(String S) {
		if (S == null || S.length() == 0) {
			return -1;
		}
		if (S.length() == 1) {
			return 0;
		}
		int mid = S.length() / 2;
		if (S.length() % 2 == 1) {
			int left = 0;
			int right = S.length() - 1;
			while (left < mid && right > mid) {
				if (S.charAt(left) != S.charAt(right)) {
					return -1;
				}
				left++;
				right--;
			}
			return mid;
		}

		return -1;
	}
}
