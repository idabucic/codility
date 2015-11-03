package com.hr.ida.codility.lessons.lesson12;

import static org.junit.Assert.*;

import org.junit.Test;

public class HolesInARoofTest {

	HolesInARoof e = new HolesInARoof();

	@Test
	public void test() {
		int[] A = { 0, 1, 0, 0, 1, 0, 1 };
		int K = 2;// number of boards
		assertEquals(3, e.solution(A, K));
	}

}
