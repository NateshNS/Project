package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLogout {
	public static WebDriver driver;
	@FindBy(id="logout")
	private WebElement Lout;

	public AdactinLogout(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getLout() {
		return Lout;
	}

}
