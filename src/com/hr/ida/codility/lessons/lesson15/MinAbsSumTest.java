package com.hr.ida.codility.lessons.lesson15;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinAbsSumTest {

	MinAbsSum m = new MinAbsSum();

	@Test
	public void test() {
		int[] A = { 1, 5, 2, -2 };
		assertEquals(0, m.solution(A));
	}

}
