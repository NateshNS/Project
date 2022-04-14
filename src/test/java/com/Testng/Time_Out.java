package com.Testng;

import org.testng.annotations.Test;

public class Time_Out {
@Test(timeOut=10000)
private void login() throws InterruptedException {
	Thread.sleep(2000);
	System.out.println("set property");
	Thread.sleep(3000);
	System.out.println("browser launch");
	Thread.sleep(5000);
	System.out.println("get url");
	Thread.sleep(2000);
	System.out.println("signin");
	Thread.sleep(2000);
	System.out.println("signout");
}
@Test(timeOut=15000)
private void username() throws InterruptedException {
	Thread.sleep(2000);
	System.out.println("set password");
	Thread.sleep(3000);
	System.out.println("check password");
	Thread.sleep(5000);
	System.out.println("go inside");
	Thread.sleep(2000);
	System.out.println("homepage");
	Thread.sleep(2000);
	System.out.println("logout from homepage");
}
}