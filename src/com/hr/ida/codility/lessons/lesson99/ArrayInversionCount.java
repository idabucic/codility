package com.hr.ida.codility.lessons.lesson99;

public class ArrayInversionCount {
	int ans = 0;

	// 100%
	public int solution(int[] A) {
		mergeSort(A, 0, A.length - 1);
		if (ans > 1000000000)
			ans = -1;
		return ans;
	}

	private void mergeSort(int[] a, int start, int end) {
		if (start >= end)
			return;
		int mid = (start + end) / 2;
		mergeSort(a, start, mid);
		mergeSort(a, mid + 1, end);
		merge(a, start, end);
	}

	private void merge(int[] a, int start, int end) {
		int mid = (start + end) / 2;
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int[] L = new int[n1 + 1];
		int[] R = new int[n2 + 1];
		for (int i = start; i <= mid; i++) {
			L[i - start] = a[i];
		}
		for (int i = mid + 1; i <= end; i++) {
			R[i - mid - 1] = a[i];
		}
		L[n1] = Integer.MAX_VALUE;
		R[n2] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if (L[i] <= R[j]) {
				a[k] = L[i++];
			} else {
				a[k] = R[j++];
				ans += n1 - i;

			}
		}
	}

}
