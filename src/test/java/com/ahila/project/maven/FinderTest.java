package com.ahila.project.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinderTest {
	

	@Test
	public void testFindMaxPos() {
		int[] arr = {5,9,4,2};
		assertEquals(9,Finder.findMax(arr));
	}
	
	@Test
	public void testFindMaxNeg() {
		assertEquals(-2,Finder.findMax(new int[]{-5,-9,-4,-2}));
	}
	
	@Test
	public void testFindMinPos() {
		assertEquals(2,Finder.findMin(new int[]{5,9,4,2}));
	}
	
	@Test
	public void testFindMinNeg() {
		assertEquals(-9,Finder.findMin(new int[]{-5,-9,-4,-2}));
	}
	
	@Test
	public void testFindMaxEmptyArr() {
		assertEquals(0,Finder.findMax(new int[]{}));
	}
	
	@Test
	public void testFindMaxNullArr() {
		assertEquals(0,Finder.findMax(null));
	}
	
	@Test
	public void testFindMinEmptyArr() {
		assertEquals(0,Finder.findMin(new int[]{}));
	}
	
	@Test
	public void testFindMinNullArr() {
		assertEquals(0,Finder.findMin(null));
	}

}
