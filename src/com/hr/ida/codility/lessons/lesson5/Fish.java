package com.hr.ida.codility.lessons.lesson5;

import java.util.Stack;

//Stacks and Queues
public class Fish {

	// 100%
	public int solution(int[] A, int[] B) {
		Stack<Integer> right = new Stack<Integer>();
		int ans = 0;
		for (int i = 0; i < A.length; i++) {
			if (B[i] == 0) {
				while (!right.isEmpty() && A[i] > right.peek()) {
					right.pop();
				}
				if (right.isEmpty()) {
					ans++;
				}
			} else {
				right.push(A[i]);
			}
		}
		return ans + right.size();
	}

}
