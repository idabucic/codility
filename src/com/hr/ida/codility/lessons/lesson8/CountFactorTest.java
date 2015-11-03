package com.hr.ida.codility.lessons.lesson8;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountFactorTest {

	CountFactor m = new CountFactor();
	
	@Test
	public void test1() {
		assertEquals(8, m.solution(24));
	}
	
	@Test
	public void test2() {
		assertEquals(2, m.solution(Integer.MAX_VALUE));
	}

}
