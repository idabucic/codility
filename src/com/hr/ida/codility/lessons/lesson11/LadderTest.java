package com.hr.ida.codility.lessons.lesson11;

import static org.junit.Assert.*;

import org.junit.Test;

public class LadderTest {

	Ladder l = new Ladder();

	@Test
	public void test() {
		int[] A = { 4, 4, 5, 5, 1 };
		int[] B = { 3, 2, 4, 3, 1 };
		int[] expecteds = { 5, 1, 8, 0, 1 };
		assertArrayEquals(expecteds, l.solution(A, B));
	}

}
