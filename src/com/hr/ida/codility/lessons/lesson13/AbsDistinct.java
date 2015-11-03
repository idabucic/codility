package com.hr.ida.codility.lessons.lesson13;

import java.util.Arrays;

//Caterpillar method
public class AbsDistinct {
	// i could use a HashSet, go from A[0] to A[n-1], add to set all absolute values of
	// the array and return size of the set


	// catepillar method
	// O(nlogn)
	// 100%
	public int solution(int[] A) {
		int n = A.length;
		if (n == 1)
			return 1;
		int[] B = new int[n];
		// filling new array B with absolute values
		// O(n)
		for (int i = 0; i < n; i++) {
			if (A[i] < 0) {
				B[i] = A[i] * (-1);
			} else {
				B[i] = A[i];
			}
		}
		// sorting B
		// O(nlog n)
		Arrays.sort(B);
		// catepillar
		// O(n)
		int front = 1;
		int back = 0;
		int count = 1;
		while (front < n) {

			if (B[front] != B[back]) {
				count++;
			}
			front++;
			back++;
		}
		return count;
	}
}
