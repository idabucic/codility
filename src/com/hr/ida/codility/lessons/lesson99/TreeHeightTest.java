package com.hr.ida.codility.lessons.lesson99;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeHeightTest {

	TreeHeight th = new TreeHeight(); 
	
	@Test
	public void test1() {
		Tree tree = new Tree(5, new Tree(3, new Tree(20, null, null), new Tree(21, null, null)), new Tree(10, new Tree(1, null, null), null));
		assertEquals(2, th.solution(tree));
	}
	
	@Test
	public void test2() {
		Tree tree = new Tree(5, new Tree(1,null,null), null); 
		assertEquals(1, th.solution(tree));
	}

	@Test
	public void test3() {
		Tree tree = null;
		assertEquals(-1, th.solution(tree));
	}
	
	@Test
	public void test4() {
		Tree tree = new Tree(5, null, null); 
		assertEquals(0, th.solution(tree));
	}
}
