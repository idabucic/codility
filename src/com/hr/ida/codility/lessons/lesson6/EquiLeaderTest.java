package com.hr.ida.codility.lessons.lesson6;

import static org.junit.Assert.*;

import org.junit.Test;

public class EquiLeaderTest {

	EquiLeader e = new EquiLeader();
	
	@Test
	public void test1() {
		int[] A = {4,3,4,4,4,2};
		assertEquals(2, e.solution(A));	
	}
	
	@Test
	public void test2() {
		int[] A = {3,3};
		assertEquals(1, e.solution(A));	
	}
}
