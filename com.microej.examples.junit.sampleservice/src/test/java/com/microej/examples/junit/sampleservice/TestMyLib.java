/*
 * Java
 *
 * Copyright 2017 IS2T. All rights reserved.
 * Use of this source code is subject to license terms..
 */
package com.microej.examples.junit.sampleservice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * The test class for MyLib
 *
 */
public class TestMyLib {

	// purposely created on BeforeClass methods
	private static MyLib myLibSingleton;

	// purposely assigned on BeforeMethod
	private MyLib myLibInstance;

	/**
	 * Class initialization method.
	 */
	@BeforeClass
	public static void createSingleton() {
		myLibSingleton = new MyLib();
	}

	/**
	 * Instance initialization method.
	 */
	@Before
	public void assignSingleton() {
		assertNull(this.myLibInstance);
		this.myLibInstance = myLibSingleton;
		assertNotNull(this.myLibInstance);
	}

	/**
	 * Test value of {@link MyLib#myToString(Object)}
	 */
	@Test
	public void testToString() {
		Object o = new Object();
		assertEquals(MyLib.myToString(o), "[" + o.toString() + "]"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * Test NPE is thrown from {@link MyLib#myToString(Object)} if parameter is null.
	 */
	@Test(expected = NullPointerException.class)
	public void testToStringNPE() {
		MyLib.myToString(null);
	}

	/**
	 * Test value of {@link MyLib#myToString(Object)}
	 */
	@Test
	public void testAdd() {
		assertEquals(this.myLibInstance.add(1, 1), 2);
		assertTrue(this.myLibInstance.add(1, -1) == 0);
	}

	/**
	 * Test value of {@link MyLib#myToString(Object)} This test is actually buggy and is therefore ignored.
	 */
	@Ignore
	@Test
	public void testAddBuggy() {
		assertEquals(this.myLibInstance.add(1, 1), 1);
	}
}
