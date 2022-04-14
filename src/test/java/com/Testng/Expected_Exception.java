package com.Testng;

import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions=ArithmeticException.class)
	private void demoo_login() {
		int a=10;
		System.out.println(a/0);
	}

}
