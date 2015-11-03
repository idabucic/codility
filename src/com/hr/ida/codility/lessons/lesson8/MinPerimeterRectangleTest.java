package com.hr.ida.codility.lessons.lesson8;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinPerimeterRectangleTest {

	MinPerimeterRectangle m = new MinPerimeterRectangle();
	
	@Test
	public void test() {
		assertEquals(22, m.solution(30));
	}

}
