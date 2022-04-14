package com.Testng;

import org.testng.annotations.Test;

public class DependencyOnMethods {

	@Test(dependsOnMethods=("pqr"))
	private void abc() {
		System.out.println("Australia trip");
	}

	@Test
	private void pqr() {
		System.out.println("switzerland trip");
	}
	
	}
	


