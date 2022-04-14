package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Logout {
	public static WebDriver driver;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signout;

	public Automation_Logout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	public WebElement getSignout() {
		return signout;
	}

	public void setSignout(WebElement signout) {
		this.signout = signout;
	}
	
	

}
