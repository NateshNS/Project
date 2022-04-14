package com.Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	private void soft_Assert_Practice() {
		String expected="saveetha";
		String actual = "saveetha";
		SoftAssert sf=new SoftAssert();
		sf.assertEquals(expected,actual);
		sf.assertAll();
		
	}

}
