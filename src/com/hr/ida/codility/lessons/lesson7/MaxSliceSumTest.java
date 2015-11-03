package com.hr.ida.codility.lessons.lesson7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxSliceSumTest {

	@Test
	public void test() {
		MaxSliceSum e = new MaxSliceSum(); 
		int[] A = {3,2,-6,4,0};
		assertEquals(5, e.solution(A));	
	}

}
