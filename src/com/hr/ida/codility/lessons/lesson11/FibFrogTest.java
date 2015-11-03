package com.hr.ida.codility.lessons.lesson11;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibFrogTest {

	FibFrog f = new FibFrog();

	@Test
	public void test() {
		int[] A = { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0 };
		assertEquals(3, f.solution(A));
	}

}
