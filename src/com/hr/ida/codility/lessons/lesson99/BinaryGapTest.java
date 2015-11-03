package com.hr.ida.codility.lessons.lesson99;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGapTest {

	BinaryGap bg = new BinaryGap(); 
	
	@Test
	public void test1() {
		int N = 529;
		assertEquals(4, bg.solution(N));
	}
	
	@Test
	public void test2() {
		int N = 9;
		assertEquals(2, bg.solution(N));
	}
	
	@Test
	public void test3() {
		int N = 20;
		assertEquals(1, bg.solution(N));
	}

	@Test
	public void test4() {
		int N = 15;
		assertEquals(0, bg.solution(N));
	}
}
