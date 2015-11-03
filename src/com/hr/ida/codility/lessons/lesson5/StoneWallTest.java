package com.hr.ida.codility.lessons.lesson5;

import static org.junit.Assert.*;

import org.junit.Test;

public class StoneWallTest {

	StoneWall s = new StoneWall(); 
	
	@Test
	public void test() {
		int[] H = {8,8,5,7,9,8,7,4,8};
		assertEquals(7, s.solution(H));
	}

}
