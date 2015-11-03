package com.hr.ida.codility.lessons.lesson13;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbsDistinctTest {

	AbsDistinct a = new AbsDistinct();

	@Test
	public void test1() {
		int[] A = { -5, 5 };
		assertEquals(1, a.solution(A));
	}

	@Test
	public void test2() {
		int[] A = { 1, 3, 3, 4, 5 };
		assertEquals(4, a.solution(A));
	}

	@Test
	public void test3() {
		int[] A = { -1, -3, -3, -4, -5 };
		assertEquals(4, a.solution(A));
	}

	@Test
	public void test4() {
		int[] A = { -3, 0, 2, 5, 7 };
		assertEquals(5, a.solution(A));
	}

	@Test
	public void test5() {
		int[] A = { -5, -3, -1, 0, 3, 6 };
		assertEquals(5, a.solution(A));
	}

	@Test
	public void test6() {
		int[] A = { -5, -5, 5, 5, 5, 5, 5, 5 };
		assertEquals(1, a.solution(A));
	}
}
