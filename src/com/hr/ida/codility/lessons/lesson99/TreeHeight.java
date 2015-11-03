package com.hr.ida.codility.lessons.lesson99;

public class TreeHeight {

	// 100%
	public int solution(Tree T) {
		return findHeight(T);
	}

	private int findHeight(Tree tree) {
		if (tree == null)
			return -1;
		if (tree.l == null && tree.r == null)
			return 0;
		return 1 + Math.max(findHeight(tree.l), findHeight(tree.r));
	}
}
