package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSearchHotel {
	public static WebDriver driver;
	@FindBy(name="location")
	private WebElement loc;
	@FindBy(xpath="(//select[@class='search_combobox'])[2]")
	private WebElement hotel;
	@FindBy(name="room_type")
	private WebElement rtype;
	@FindBy (name="room_nos")
	private WebElement rno;
	@FindBy(xpath="//input[@type='text']")
	private WebElement checkin;
	@FindBy(name="datepick_out")
	private WebElement checkout;
	@FindBy(name="adult_room")
	private WebElement aroom;
	@FindBy(name="child_room")
	private WebElement croom;
	@FindBy(name="Submit")
	private WebElement search;
	
	public AdactinSearchHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getRtype() {
		return rtype;
	}
	public WebElement getRno() {
		return rno;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getAroom() {
		return aroom;
	}
	public WebElement getCroom() {
		return croom;
	}
	public WebElement getSearch() {
		return search;
	}
}
	
	
	
	
	