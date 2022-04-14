package com.Testng;

import org.testng.annotations.Test;

public class Grouping_Test {
	@Test(groups="music")
	private void wynk() {
     System.out.println("music playback application ");
	}
	
	@Test(groups="music")
	private void spotify() {
System.out.println("free music applicatiion");
	}
	
	@Test(groups="cricscores")
	private void cricbuzz() {
System.out.println("viewing scores application");
	}
	@Test(groups="cricscores")
	private void cricscores() {
System.out.println("cricket history application ");
	}
	@Test(groups="ecommerce")
	private void paytm() {
System.out.println("payment application");
	}
	
	@Test(groups="ecommerce")
	private void flipkart() {
System.out.println("ecommerce");
	}
	


}
