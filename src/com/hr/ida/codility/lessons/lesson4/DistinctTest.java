package com.hr.ida.codility.lessons.lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistinctTest {

	Distinct m = new Distinct();

	@Test
	public void test() {
		int[] X = { 2, 1, 1, 2, 3, 1, 8 };
		assertEquals(4, m.solution(X));
	}

}
