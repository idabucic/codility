package com.hr.ida.codility.lessons.lesson13;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDistinctSlicesTest {

	CountDistinctSlices c = new CountDistinctSlices();

	@Test
	public void test() {
		int M = 6;
		int[] A = { 3, 4, 5, 5, 2 };
		assertEquals(9, c.solution(M, A));
	}

}
