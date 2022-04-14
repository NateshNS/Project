package com.Testng;

import org.testng.annotations.Test;
import org.testng.annotations.Ignore;

public class IgnoreTest {
	@Ignore
	@Test
	private void dresses() {
		System.out.println("dresses");
       }
	@Test(enabled=false)
	private void tshirts() {
	System.out.println("tshirts");
	}
	@Test
	private void men() {
		System.out.println("men dress");
		}
	@Test
	private void women() {
		System.out.println("women dress");
		}
	@Test
	private void shopping_completed() {
	System.out.println("shopping completed");
	}

}
