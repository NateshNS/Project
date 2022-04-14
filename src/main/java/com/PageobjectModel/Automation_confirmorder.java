package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_confirmorder {
	public static WebDriver driver;
	@FindBy(xpath="//*[text()='I confirm my order']")
	private WebElement confirm;

	public Automation_confirmorder(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public WebElement getConfirm() {
		return confirm;
	}
	

}
