package com.hr.ida.codility.lessons.lesson2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxCountersTest {

	MaxCounters mc = new MaxCounters();
	
	@Test
	public void test() {
		int N = 5; 
		int[] A = {3,4,4,6,1,4,4};
		assertArrayEquals(new int[] {3,2,2,4,2}, mc.solution(N, A));
	}

}
