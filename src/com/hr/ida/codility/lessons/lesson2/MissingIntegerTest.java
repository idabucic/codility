package com.hr.ida.codility.lessons.lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingIntegerTest {

	MissingInteger mi = new MissingInteger();
	
	@Test
	public void test1() {
		int[] A = {3, 1, 2};
		assertEquals(4, mi.solution(A));
	}

	@Test
	public void test2() {
		int[] A = {200003, 200005, 200006};
		assertEquals(1, mi.solution(A));
	}
	
	@Test
	public void test3() {
		int[] A = {1, 2, 3};
		assertEquals(4, mi.solution(A));
	}
}
