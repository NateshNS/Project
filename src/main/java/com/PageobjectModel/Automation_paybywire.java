package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_paybywire {
	public static WebDriver driver;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement pay;

	public Automation_paybywire(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getPay() {
		return pay;
	}
	
	

}
