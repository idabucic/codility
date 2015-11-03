package com.hr.ida.codility.lessons.lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxProductOfThreeTest {

	MaxProductOfThree m = new MaxProductOfThree();
	
	@Test
	public void test() {
		int[] A = {-3,1,2,-2,5,6};
		assertEquals(60, m.solution(A));
	}

}
