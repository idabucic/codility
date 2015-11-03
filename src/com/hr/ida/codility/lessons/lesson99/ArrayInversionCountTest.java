package com.hr.ida.codility.lessons.lesson99;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayInversionCountTest {

	ArrayInversionCount i = new ArrayInversionCount();
	
	@Test
	public void test1() {
		int[] A = {2, 4, 1, 3, 5};
		assertEquals(3, i.solution(A));
	}

	
	@Test
	public void test2() {
		int[] A = {-1,6,3,4,7,4};
		assertEquals(4, i.solution(A));
	}
}
