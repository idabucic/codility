package com.hr.ida.codility.lessons.lesson5;

import static org.junit.Assert.*;

import org.junit.Test;

public class NestingTest {

	Brackets b = new Brackets();
	
	@Test
	public void test1() {
		String s = "(()))";
		assertEquals(0, b.solution(s));	
	}
	
	@Test
	public void test2() {
		String s = "((()()()))";
		assertEquals(1, b.solution(s));	
	}

	@Test
	public void test3() {
		String s =  "(()(())())";
		assertEquals(1, b.solution(s));	
	}
}
