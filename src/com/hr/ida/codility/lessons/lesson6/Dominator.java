package com.hr.ida.codility.lessons.lesson6;

import java.util.Stack;

//Leader
public class Dominator {
	// 100%
	// the function may return 0, 2, 4, 6 or 7
	public int solution(int[] A) {
		int n = A.length;
		int ret = -1;
		if (n == 0) {
			return -1;
		}
		if (n == 1) {
			return 0;
		}
		Stack<Integer> a = new Stack<Integer>();
		a.push(A[0]);

		for (int i = 1; i < n; i++) {
			if (a.size() > 0 && A[i] != a.peek()) {
				a.pop();
			} else {
				a.push(A[i]);
			}
		}
		if (a.size() > 0) {
			int candidate = a.peek();
			int counter = 0;
			int index = 0;
			for (int i = 0; i < n; i++) {
				if (A[i] == candidate) {
					counter++;
					index = i;
				}
			}
			if (counter > n / 2) {
				ret = index;
			}
		}
		return ret;
	}
	
	public static void main(String[] args) {
		
		  Dominator d = new Dominator(); 
		  int[] A = {3,4,3,2,3,-1,3,3};
		  System.out.println(d.solution(A));
	}
}
