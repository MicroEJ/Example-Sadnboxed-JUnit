/*
 * Java
 *
 * Copyright 2017 IS2T. All rights reserved.
 * Use of this source code is subject to license terms..
 */
package com.microej.examples.junit.sampleservice;

/**
 * The Library class to be tested. <br>
 * This class has obviously no other purpose than to be tested.
 *
 */
public class MyLib {

	/**
	 * Returns the result of the toString method on the object given as argument, wrapped between brackets.
	 *
	 * @param o
	 *            the object to call toString on
	 * @return o.toString()
	 * @throws NullPointerException
	 *             if o is null.
	 */
	public static String myToString(Object o) {
		return "[" + o.toString() + "]"; //$NON-NLS-1$//$NON-NLS-2$
	}

	/**
	 * Returns the sum of two integers;
	 *
	 * @param a
	 *            the first operand
	 * @param b
	 *            the second operand
	 * @return a + b
	 */
	public int add(int a, int b) {
		return a + b;
	}
}
