package com.hr.ida.codility.lessons.lesson9;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountSemiprimesTest {

	@Test
	public void test() {
		 CountSemiprimes c = new CountSemiprimes(); 
		 int[] P = {1,4,16}; 
		 int[] Q = {26,10,20}; 
		 int N = 26; 
		 int[] count = c.solution(N, P, Q);
		 assertArrayEquals(new int[] {10,4,0}, count);
	}

}
