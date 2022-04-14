package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_casual_dress {
public static WebDriver driver;
@FindBy(xpath="(//a[text()='Casual Dresses'])[4]")
private WebElement casualdress;
public Automation_casual_dress(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2,this);
}
public WebElement getCasualdress() {
	return casualdress;
}




}
