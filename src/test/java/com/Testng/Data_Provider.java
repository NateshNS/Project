package com.Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider="data")
	private void creds(String username,String Password) {
      System.out.println("username is:" +username);
      System.out.println("password:"+Password);
      
	}
@DataProvider
private Object[][] data() {
return new Object [][] {
	{"natesh","28"},
	{"myil", "29"},
	{"gnani","31"}
	



};

}
}





