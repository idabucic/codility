package com.hr.ida.codility.lessons.lesson9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountNonDivisibleTest {

	CountNonDivisible c = new CountNonDivisible();
	
	@Test
	public void test1() {
		int[] A = { 3, 1, 2, 3, 6 };
		assertArrayEquals(new int[] {2, 4, 3, 2, 0}, c.solution(A));
	}

	@Test
	public void test2() {
		int[] A = {7,3,2};
		assertArrayEquals(new int[] {2,2,2}, c.solution(A));
	}
	
	@Test
	public void test3() {
		int[] A = {3};
		assertArrayEquals(new int[] {0}, c.solution(A));
	}
}
