package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_HomePage {
	public static WebDriver driver;
	@FindBy(xpath="//a[normalize-space()='Sign in']")
	private WebElement sign;

	
	public Automation_HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSign() {
		return sign;
	}
	

}
