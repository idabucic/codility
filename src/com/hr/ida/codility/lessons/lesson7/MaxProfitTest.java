package com.hr.ida.codility.lessons.lesson7;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProfitTest {

	@Test
	public void test() {
		MaxProfit m = new MaxProfit();
		int[] A = {23171, 21011, 21123, 21366, 21013, 21367};
		assertEquals(356, m.solution(A));	
	}

}
