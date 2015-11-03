package com.hr.ida.codility.lessons.lesson15;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoinChangingTest {

	CoinChanging cc = new CoinChanging();

	@Test
	public void test() {
		int[] X = { 1, 3, 4 };
		int n = 6;
		assertEquals(2, cc.solution(X, n));
	}

}
