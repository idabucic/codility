package com.hr.ida.codility.lessons.lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	Triangle t = new Triangle();

	@Test
	public void test1() {
		int[] X = { 10, 2, 5, 1, 8, 20 };
		assertEquals(1, t.solution(X));
	}

	@Test
	public void test2() {
		int[] X = { 10, 50, 5, 1 };
		assertEquals(0, t.solution(X));
	}
}
