package com.hr.ida.codility.lessons.lesson14;

import static org.junit.Assert.*;

import org.junit.Test;

public class TieRopesTest {

	TieRopes t = new TieRopes();

	@Test
	public void test1() {
		int[] A = { 2, 2 };
		int K = 4;
		assertEquals(1, t.solution(K, A));
	}

	@Test
	public void test2() {
		int[] A = { 1, 2, 3, 4, 1, 1, 3 };
		int K = 4;
		assertEquals(3, t.solution(K, A));
	}
}
