package com.Testng;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(priority = -3)
	private void setproperty() {
		System.out.println("set property");
}
	@Test(priority = -2)
	private void browser_launch() {
		System.out.println("browser launch");
	}
	@Test(priority = -1)
	private void geturl() {
		System.out.println("get url");
}
	@Test(invocationCount =5,priority=1)
	private void refresh() {
	System.out.println("refresh");
	}
@Test(priority=2)
private void sign_in() {
	System.out.println("signin");
}
	

}
