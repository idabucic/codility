package com.hr.ida.codility.lessons.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDivTest {
	
	CountDiv c = new CountDiv();

	@Test
	public void test() {
		int A = 6; 
		int B = 11; 
		int K = 2;
		assertEquals(3, c.solution(A, B, K));
	}

}
