package com.hr.ida.codility.lessons.lesson14;


//Greedy algorithms
public class TieRopes {
	// Greedy algorithm & catepillar method
	// 100%
	public int solution(int K, int[] A) {
		int n = A.length;
		int count = 0;
		int front = 0;
		int back = 0;
		int sum = 0;
		while (front < n) {
			if (A[front] >= K) {
				count++;
				front++;
				back++;
			} else {
				sum = A[back];
				while (sum < K && front < n) {
					front++;
					if (front < n) {
						sum += A[front];
					} else {
						break;
					}

				}
				if (sum >= K) {
					count++;
					back = front + 1;
					front = front + 1;
				} else {
					return count;
				}
			}
		}
		return count;
	}

	// Greedy algorithm
	// 100%
	public int solutionSimpler(int K, int[] A) {
		int count = 0, sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			if (sum >= K) {
				count++;
				sum = 0;
			}
		}
		return count;
	}

}
