package com.hr.ida.codility.lessons.lesson14;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxNonoverlappingSegmentsTest {

	MaxNonoverlappingSegments f = new MaxNonoverlappingSegments();

	@Test
	public void test() {
		int[] A = { 1, 3, 6, 9, 9 };
		int[] B = { 5, 6, 8, 9, 10 };
		assertEquals(3, f.solution(A, B));
	}

}
