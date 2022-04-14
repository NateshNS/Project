package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Booking_Page {
	public static WebDriver driver;
@FindBy(xpath="//a[@title='Women']")
private WebElement women;

public Adactin_Booking_Page(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getWomen() {
	return women;
}

}
