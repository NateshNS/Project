package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Add_To_Cart {
	public static WebDriver driver;
	@FindBy(xpath="//*[text()='Add to cart']")
	private WebElement addtocart;

	public Automation_Add_To_Cart(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	

}
