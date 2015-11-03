package com.hr.ida.codility.lessons.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassingCarsTest {

	PassingCars p = new PassingCars();
	
	@Test
	public void test1() {
		int[] X = {0,1,0,1,1}; 
		assertEquals(5, p.solution(X));
	}
	
	@Test
	public void test2() {
		int[] X = {0}; 
		assertEquals(0, p.solution(X));
	}

}
