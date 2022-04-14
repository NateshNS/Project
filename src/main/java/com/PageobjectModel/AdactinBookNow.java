package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookNow {
	public static WebDriver driver;
	@FindBy(name="first_name")
	private WebElement fname;
	@FindBy(name="last_name")
	private WebElement lname;
	@FindBy(name="address")
	private WebElement baddress;
	@FindBy(name="cc_num")
	private WebElement creditno;
	@FindBy(name="cc_type")
	private WebElement cretype;
	@FindBy (name="cc_exp_month")
	private WebElement expmon;
	@FindBy(name="cc_exp_year")
	private WebElement expyr;
	@FindBy(name="cc_cvv")
	private WebElement cvvno;
	@FindBy(name="book_now")
	private WebElement Book;
	public AdactinBookNow(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getBaddress() {
		return baddress;
	}
	public WebElement getCreditno() {
		return creditno;
	}
	public WebElement getCretype() {
		return cretype;
	}
	public WebElement getExpmon() {
		return expmon;
	}
	public WebElement getExpyr() {
		return expyr;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	public WebElement getBook() {
		return Book;
	}
	
	
	

}
