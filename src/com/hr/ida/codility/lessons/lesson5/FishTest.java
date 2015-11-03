package com.hr.ida.codility.lessons.lesson5;

import static org.junit.Assert.*;

import org.junit.Test;

public class FishTest {

	Fish f = new Fish();
	
	@Test
	public void test() {
		int[] A = { 4, 3, 2, 1, 5 };
		int[] B = { 0, 1, 0, 0, 0 };
		assertEquals(2, f.solution(A, B));	
	}

}
