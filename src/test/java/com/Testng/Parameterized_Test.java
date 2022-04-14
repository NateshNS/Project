package com.Testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	@Test
	@Parameters({"username","password"})
	private void credentials(@Optional("saveetha_college")String username,@Optional("mechdept") String password) {
		System.out.println("username is:"+ username);
		System.out.println("password is:"+ password);
		
	}

}
