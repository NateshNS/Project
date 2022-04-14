package com.Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgPractice {
	@BeforeSuite
	private void set_property() {
		System.out.println("property set completed");

	}
	@BeforeTest
	private void browser_launch() {
		System.out.println("browser launched");
}
	@BeforeClass
	private void geturl() {
		System.out.println("url opened");
		}
	@BeforeMethod
	private void signin() {
		System.out.println("signing_in");
       }
	@Test
	private void dress() {
		System.out.println("go to dresses");
	}
	
	@Test
	private void boys() {
	   System.out.println("boys dress");
	}
	
	@Test
	private void tshirt() {
		System.out.println("get tshirt");
}
	@Test
	private void finish_Purchase() {
		System.out.println("purchase completed");
	}
	@AfterMethod
	private void sign_out() {
		System.out.println("signing out");

	}
	@AfterClass
	private void home_page() {
		System.out.println("home page");

	}
	@AfterTest
	private void close() {
		System.out.println("close everything");
}
	@AfterSuite
	private void deleteallcookies() {
		System.out.println("delete cookies");
		}
	
	
	

	}
	

	


