package com.hr.ida.codility.lessons.lesson2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogRiverOneTest {

	FrogRiverOne f = new FrogRiverOne();
	
	@Test
	public void test1() {
		int [] A = {1,3,1,4,2,3,5,4};
		int x = 5;
		assertEquals(6, f.solution(x, A));
	}
	
	@Test
	public void test2() {
		int [] A = {3};
		int x = 5;
		assertEquals(-1, f.solution(x, A));
	}
	
	@Test
	public void test3() {
		int [] A = {2,1};
		int x = 5;
		assertEquals(-1, f.solution(x, A));
	}
	 
}
