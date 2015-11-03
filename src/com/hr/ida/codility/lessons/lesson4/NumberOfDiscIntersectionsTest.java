package com.hr.ida.codility.lessons.lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberOfDiscIntersectionsTest {

	NumberOfDiscIntersections n = new NumberOfDiscIntersections();
	
	@Test
	public void test1() {
		int[] X = {1, 5, 2, 1, 4, 0};
		assertEquals(11, n.solution(X));
	}

	@Test
	public void test2() {
		int[] X = {2, 1, 1};
		assertEquals(3, n.solution(X));
	}
	
}
