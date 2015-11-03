package com.hr.ida.codility.lessons.lesson5;

import java.util.Stack;

//Stacks and Queues
public class StoneWall {

	/*
	 * each element in the stack represents a block used to reach the current level
	 * for the next step it is necessary to add a block, or to remove enough blocks 
	 * to get the right size, or something less than that, and then add a new block
	 */
	// 100%
	public int solution(int[] H) {
		Stack<Integer> stack = new Stack<Integer>();
		int count = 1;

		stack.push(H[0]);

		for (int i = 1; i < H.length; i++) {
			if (H[i] < stack.elementAt(stack.size() - 1)) {
				while (!stack.isEmpty()
						&& H[i] < stack.elementAt(stack.size() - 1)) {
					stack.pop();
				}
			}
			if (stack.size() == 0) {
				stack.push(H[i]);
				count++;
				continue;
			}
			if (H[i] == stack.elementAt(stack.size() - 1)) {
				continue;
			}
			if (H[i] > stack.elementAt(stack.size() - 1)) {
				stack.push(H[i]);
				count++;
			}

		}
		return count;
	}
}
