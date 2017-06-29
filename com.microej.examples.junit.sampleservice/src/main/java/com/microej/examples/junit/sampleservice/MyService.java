/*
 * Java
 *
 * Copyright 2017 IS2T. All rights reserved.
 * Use of this source code is subject to license terms..
 */
package com.microej.examples.junit.sampleservice;

import ej.wadapps.app.BackgroundService;

/**
 * The Library class to be tested.
 *
 */
public class MyService implements BackgroundService {

	@Override
	public void onStart() {
		MyLib lib = new MyLib();
		StringBuffer message = new StringBuffer("Value is "); //$NON-NLS-1$
		message.append(lib.add(2, 3));
		System.out.println("message is: " + MyLib.myToString(message)); //$NON-NLS-1$
	}

	@Override
	public void onStop() {
		// nothing to do on stop
	}

}
