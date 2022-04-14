package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Radio {
	public static WebDriver driver;
	
	@FindBy(name="cgv")
	private WebElement radio;

	public Automation_Radio(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}

	public WebElement getRadio() {
		return radio;
	}
	

}
