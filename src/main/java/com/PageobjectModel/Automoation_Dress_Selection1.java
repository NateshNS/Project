package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automoation_Dress_Selection1 {
	public static WebDriver driver;
	@FindBy(xpath="(//a[text()='Dresses'])[4]")
	private WebElement dress;

	public Automoation_Dress_Selection1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDress() {
		return dress;
	}
	
	
	

}
