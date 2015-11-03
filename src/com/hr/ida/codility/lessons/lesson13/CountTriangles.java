package com.hr.ida.codility.lessons.lesson13;

import java.util.Arrays;

//Caterpillar method
public class CountTriangles {

	// 100%
	public int solution(int[] A) {
		int n = A.length;
		if (n < 3)
			return 0;
		Arrays.sort(A);
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			// z has to be initialized here, not in the next loop
			// initialization is an expensive operation
			int z = i + 2;
			for (int j = i + 1; j < n - 1; j++) {
				// no need to check for A[Q] + A[R] > A[P] and A[R] + A[P] >
				// A[Q]
				while (z < n && A[i] + A[j] > A[z]) {
					z++;
				}
				count += z - j - 1;
			}
		}
		return count;
	}

	// O(n^2) 100%
	public int solution2(int[] A) {
		Arrays.sort(A);
		int ans = 0, n = A.length;
		for (int i = 0; i < n - 2; i++) {
			int k = 0;
			for (int j = i + 1; j < n - 1; j++) {
				while (k < n && A[i] + A[j] > A[k]) {
					k++;
				}
				ans += k - j - 1;
			}
		}
		return ans;
	}

}
