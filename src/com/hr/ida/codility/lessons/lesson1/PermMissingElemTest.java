package com.hr.ida.codility.lessons.lesson1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermMissingElemTest {
	PermMissingElem m = new PermMissingElem();

	@Test
	public void test1() {
		int[] A = { 2, 3 };
		assertEquals(1, m.solution(A));
	}

	@Test
	public void test2() {
		int[] A = { 2, 3, 1, 5 };
		assertEquals(4, m.solution(A));
	}

	@Test
	public void test3() {
		int[] A = { 1 };
		assertEquals(2, m.solution(A));
	}

	@Test
	public void test4() {
		int[] A = { 2 };
		assertEquals(1, m.solution(A));
	}
}
