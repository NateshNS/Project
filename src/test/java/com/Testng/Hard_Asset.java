package com.Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Asset {
	@Test(retryAnalyzer = Retry_Class.class)
	private void validation() {
	String expected="Natesh";
	String actual= "Natesh";
	//Assert.assertEquals(actual, expected);
	Assert.assertNotEquals(actual, expected);
	
	
	
	}
	@Test
private void validationtwo() {
	String expect="greens";
	String act="saveetha";
	Assert.assertEquals(expect,act);
}
}
