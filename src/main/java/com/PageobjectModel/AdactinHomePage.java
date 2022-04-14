package com.PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHomePage {
	
		public static WebDriver driver;
		@FindBy(name="login")
		private WebElement log;
		
		@FindBy(xpath="//input[@type='text']")
		private WebElement user;
		
		@FindBy(name="password")
		private WebElement pwd;

		public AdactinHomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
			
		

		public WebElement getLog() {
			return log;
		}

		public WebElement getUser() {
			return user;
		}

		public WebElement getPwd() {
			return pwd;
		}
}
		
		
		
		
	
	