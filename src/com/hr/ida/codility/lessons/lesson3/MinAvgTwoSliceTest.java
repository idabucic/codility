package com.hr.ida.codility.lessons.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinAvgTwoSliceTest {

	MinAvgTwoSlice m = new MinAvgTwoSlice();
	
	@Test
	public void test() {
		int[] X = {4,2,2,5,1,5,8};
		assertEquals(1, m.solution(X));
	}

}
