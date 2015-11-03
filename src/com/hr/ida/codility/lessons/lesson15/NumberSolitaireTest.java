package com.hr.ida.codility.lessons.lesson15;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberSolitaireTest {

	NumberSolitaire ns = new NumberSolitaire();

	@Test
	public void test() {
		int[] A = { 1, -2, 0, 9, -1, -2 };
		assertEquals(8, ns.solution(A));
	}

}
