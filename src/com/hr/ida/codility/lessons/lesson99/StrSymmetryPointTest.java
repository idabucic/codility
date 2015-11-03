package com.hr.ida.codility.lessons.lesson99;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrSymmetryPointTest {

	StrSymmetryPoint s = new StrSymmetryPoint();
	
	@Test
	public void test1() {
		assertEquals(3, s.solution("racecar"));
	}

	@Test
	public void test2() {
		assertEquals(0, s.solution("x"));
	}
	
	@Test
	public void test3() {
		assertEquals(-1, s.solution("ab"));
	}
}
