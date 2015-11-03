package com.hr.ida.codility.lessons.lesson3;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenomicRangeQueryTest {

	GenomicRangeQuery g = new GenomicRangeQuery();
	
	@Test
	public void test() {
		String S = "CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};
		assertArrayEquals(new int[] {2,4,1}, g.solution(S, P, Q));
	}

}
