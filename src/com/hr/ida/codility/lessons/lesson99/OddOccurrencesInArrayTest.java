package com.hr.ida.codility.lessons.lesson99;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddOccurrencesInArrayTest {

	OddOccurrencesInArray o = new OddOccurrencesInArray();
	
	@Test
	public void test1() {
		int[] A = {9,3,9,3,9,7,9}; 
		assertEquals(7, o.solution(A));
	}

	@Test
	public void test2() {
		int[] A = {7}; 
		assertEquals(7, o.solution(A));
	}
	
	@Test
	public void test3() {
		int[] A = {7,7}; 
		assertEquals(0, o.solution(A));
	}
}
