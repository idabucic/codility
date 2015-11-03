package com.hr.ida.codility.lessons.lesson13;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountTrianglesTest {

	CountTriangles ct = new CountTriangles();

	@Test
	public void test() {
		int[] A = { 10, 2, 5, 1, 8, 12 };
		assertEquals(4, ct.solution(A));
	}

}
