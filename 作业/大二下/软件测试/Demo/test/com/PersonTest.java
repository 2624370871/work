package com;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	private static Person person=new Person("Fred",18,"ÄÐ","13612251254",null,170,65);
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetName() {
		String nameTest="Fred";
		assertSame(nameTest,person.getName());
	}
	
	@Test
	public void testGetNotName() {
		String nameTest="Hero";
		assertNotSame(nameTest,person.getName());
	}
	
	@Test
	public void testGetAge() {
		assertEquals(18,person.getAge());
	}

	@Test
	public void testGetSex() {
		assertTrue(1==person.getSex());
	}
	
	@Test
	public void testGetNotSex() {
		assertFalse(0==person.getSex());
	}

	@Test
	public void testGetCode() {
		assertNull(person.getCode());
	}

	@Test
	public void testGetNo() {
		assertNotNull(person.getNo());
	}

	@Test
	public void testGetHeigwei() {
		assertArrayEquals(new int[] {170,65},person.getHeigwei());
	}

}
