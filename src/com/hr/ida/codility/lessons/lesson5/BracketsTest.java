package com.hr.ida.codility.lessons.lesson5;

import static org.junit.Assert.*;

import org.junit.Test;

public class BracketsTest {

	@Test
	public void test1() {
		Brackets b = new Brackets();
		String S = "{()]}";
		assertEquals(0, b.solution(S));	
	}
	
	@Test
	public void test2() {
		Brackets b = new Brackets();
		String S = "{[()]}";
		assertEquals(1, b.solution(S));	
	}

}
