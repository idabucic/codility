package com.hr.ida.codility.lessons.lesson13;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinAbsSumOfTwoTest {

	MinAbsSumOfTwo m = new MinAbsSumOfTwo();

	@Test
	public void test1() {
		int[] A = { 1, 4, -3 };
		assertEquals(1, m.solution(A));
	}

	@Test
	public void test2() {
		int[] A = { -8, 4, 5, -10, 3 };
		assertEquals(3, m.solution(A));
	}

	@Test
	public void test3() {
		int[] A = { 2, 2, 2, 2, 2, -3, -3, -3 };
		assertEquals(1, m.solution(A));
	}
}
