package com.Testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Retry_Class implements IRetryAnalyzer {
	int start=1;
	int end=5;
	@Override
	public boolean retry(ITestResult result) {
		
		if(start<=end) {
			start++;
		return true;
	}
			
				return false;
	}
	

}
