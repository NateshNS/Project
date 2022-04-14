package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_checkout4 {
	public static WebDriver driver;
	@FindBy(xpath="(//*[normalize-space()='Proceed to checkout'])[4]")
	private WebElement proceed4;

	public Proceed_checkout4(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	public WebElement getProceed4() {
		return proceed4;
	}
	
	
	

}
