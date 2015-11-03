package com.hr.ida.codility.lessons.lesson12;

//Binary search algorithm example from reading material
public class HolesInARoof {

	public int solution(int[] A, int K) {
		int n = A.length;
		int beg = 1;
		int end = n;
		int mid = 0;
		int result = -1;
		while (beg <= end) {
			mid = (int) (beg + end) / 2;
			if (check(A, mid) <= K) {
				end = mid - 1;
				result = mid;
			} else {
				beg = mid + 1;
			}
		}
		return result;
	}

	private int check(int[] A, int K) {
		int n = A.length;
		int count = 0;
		int last = -1;
		for (int i = 0; i < n; i++) {
			if (A[i] == 1 && last < i) {
				count++;
				last = i + K - 1;
			}
		}
		return count;
	}

}
