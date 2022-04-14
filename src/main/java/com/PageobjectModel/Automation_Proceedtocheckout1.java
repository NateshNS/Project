package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Proceedtocheckout1 {
	public static WebDriver driver;
	@FindBy(xpath="//*[normalize-space()='Proceed to checkout']")
	private WebElement proceed1;
	public Automation_Proceedtocheckout1(WebDriver driver2) {
		this.driver=driver2;
	    PageFactory.initElements(driver2,this);
	}
	public WebElement getProceed1() {
		return proceed1;
	}
	
	

}
