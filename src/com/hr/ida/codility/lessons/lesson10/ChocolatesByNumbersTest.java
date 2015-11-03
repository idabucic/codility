package com.hr.ida.codility.lessons.lesson10;

import static org.junit.Assert.*;

import org.junit.Test;

public class ChocolatesByNumbersTest {

	ChocolatesByNumbers c = new ChocolatesByNumbers();

	@Test
	public void test() {
		int N = 10;
		int M = 4;
		assertEquals(5, c.solution(N, M));
	}

}
