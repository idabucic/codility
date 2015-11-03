package com.hr.ida.codility.lessons.lesson10;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommonPrimeDivisorsTest {

	CommonPrimeDivisors c = new CommonPrimeDivisors();

	@Test
	public void test() {
		int[] A = { 15, 10, 3 };
		int[] B = { 75, 30, 5 };
		assertEquals(1, c.solution(A, B));
	}

}
