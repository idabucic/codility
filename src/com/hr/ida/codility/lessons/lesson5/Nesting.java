package com.hr.ida.codility.lessons.lesson5;

import java.util.Stack;

//Stacks and Queues
public class Nesting {
	// 100%
	public int solution(String S) {
		Stack<Character> stack = new Stack<Character>();
		if (S.isEmpty())
			return 1;
		if (S.charAt(0) == ')')
			return 0;
		for (int i = 0; i < S.length(); i++) {

			if (i > 0) {
				if (S.charAt(i) == ')') {
					if (stack.size() > 0) {
						if ((char) stack.elementAt(stack.size() - 1) == '(') {
							stack.pop();
							continue;
						}
					} else {
						return 0;
					}
				}

			}
			stack.push(S.charAt(i));
		}
		if (stack.size() == 0)
			return 1;
		else
			return 0;
	}

	
}
