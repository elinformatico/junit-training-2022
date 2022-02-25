/**
 * 
 */
package com.junit.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

/**
 * @author ingsi
 *
 */
public class AppTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("@Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("@After");
	}

	@Test
	public void test1() {
		System.out.println("Test 1");
		assertNotNull(getClass());
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
		assertNotNull(getClass());
	}

}
