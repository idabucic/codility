package com.hr.ida.codility.lessons.lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TapeEquilibriumTest {

	TapeEquilibrium te = new TapeEquilibrium();

	@Test
	public void test1() {
		int[] A = { 3, 1, 2, 4, 3 };
		assertEquals(1, te.solution(A));
	}

	@Test
	public void test2() {
		int[] A = { 3 };
		assertEquals(3, te.solution(A));
	}

}
