package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelConfirmation {
	public static WebDriver driver;
	@FindBy(name="radiobutton_0")
	private WebElement Radio;
	@FindBy(name="continue")
	private WebElement con;
	public AdactinHotelConfirmation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getRadio() {
		return Radio;
	}
	public WebElement getCon() {
		return con;
	}
	
	

}
