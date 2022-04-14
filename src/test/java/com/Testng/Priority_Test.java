package com.Testng;

import org.testng.annotations.Test;

public class Priority_Test {
	@Test(priority=-3)
	private void saveetha() {
		System.out.println("saveetha");
	}
	@Test(priority=-1)
	private void greens() {
	System.out.println("greens");
	}
	@Test(priority=-2)
	private void stjosephs() {
		System.out.println("josephs");
	}
	@Test(priority=1)
	private void paramveer() {
	System.out.println("paramveer");
	}
	
	@Test(priority=2)
	private void rajalakshmi() {
	System.out.println("rajalakshmi");
	}
	

}
