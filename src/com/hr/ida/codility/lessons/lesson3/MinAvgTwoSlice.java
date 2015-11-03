package com.hr.ida.codility.lessons.lesson3;

//Prefix Sums
public class MinAvgTwoSlice {
	//100%
	public int solution(int[] A) {
		// variables have to be double, not float
		double minAvgValue = (double) (A[0] + A[1]) / 2;
		int minPosition = 0;
		for (int i = 1; i < A.length - 2; i++) {
			if ((double) (A[i] + A[i + 1]) / 2 < minAvgValue) {
				minAvgValue = (double) (A[i] + A[i + 1]) / 2;
				minPosition = i;
			}
			if ((double) (A[i] + A[i + 1] + A[i + 2]) / 3 < minAvgValue) {
				minAvgValue = (double) (A[i] + A[i + 1] + A[i + 2]) / 3;
				minPosition = i;
			}
		}
		if ((double) (A[A.length - 2] + A[A.length - 1]) / 2 < minAvgValue) {
			minPosition = A.length - 2;
		}
		return minPosition;
	}

}
