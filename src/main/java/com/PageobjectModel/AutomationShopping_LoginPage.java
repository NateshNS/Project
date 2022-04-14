package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationShopping_LoginPage {
	public static WebDriver driver;
	@FindBy(id="email")
	private WebElement ema;
	@FindBy(name="passwd")
	private WebElement pwd;
	@FindBy(xpath="(//*[normalize-space()='Sign in'] )[5]")
	private WebElement signin;
	public AutomationShopping_LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getEma() {
		return ema;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getSignin() {
		return signin;
	}
	
	
	
	
	

}
