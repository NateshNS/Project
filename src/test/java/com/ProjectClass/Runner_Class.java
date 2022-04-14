package com.ProjectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runner_Class extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver=set("chrome");
		
	//	a.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		WebElement email = driver.findElement(By.id("email"));
		//email.sendKeys("smyilvagana@gmail.com");
		input(email, "smyilvaganan@gmail.com");
		WebElement pwd = driver.findElement(By.name("passwd"));
		//pwd.sendKeys("123@myil");
		input(pwd, "123@myil");
		WebElement signin = driver.findElement(By.xpath("//span[normalize-space()='Sign in']"));
		//signin.click();
		clickbtn(signin);
	//	close();
		//quit();
		
	}

}
