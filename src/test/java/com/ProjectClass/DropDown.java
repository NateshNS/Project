package com.ProjectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) {

		driver=set("Chrome");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		get("https://www.facebook.com/");
		WebElement reg = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		clickbtn(reg);
		WebElement dob = driver.findElement(By.name("birthday_month"));
		dropdown(dob,"Visible text","Aug");
		WebElement year = driver.findElement(By.xpath("//select[@title='Year']"));
		dropdown(year, "value", "2018");
		WebElement day = driver.findElement(By.name("birthday_day"));
		dropdown(day, "index", "2");
		
		
		
	}

}
