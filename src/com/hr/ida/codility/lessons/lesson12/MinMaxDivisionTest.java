package com.hr.ida.codility.lessons.lesson12;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxDivisionTest {

	MinMaxDivision f = new MinMaxDivision();

	@Test
	public void test() {
		int K = 3;
		int M = 5;
		int[] A = { 2, 1, 5, 1, 2, 2, 2 };
		assertEquals(6, f.solution(K, M, A));
	}

}
