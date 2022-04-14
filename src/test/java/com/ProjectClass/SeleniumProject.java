package com.ProjectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject {
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://adactinhotelapp.com/");
	a.manage().window().maximize();
	a.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	WebElement register = a.findElement(By.xpath("//a[text()='New User Register Here']"));
	register.click();
	WebElement username = a.findElement(By.name("username"));
	username.sendKeys("nateshnsns");
	WebElement pass = a.findElement(By.name("password"));
	pass.sendKeys("JumpJump@!44");
	WebElement confirmpass = a.findElement(By.name("re_password"));
	confirmpass.sendKeys("JumpJump@!44");
	WebElement fname = a.findElement(By.name("full_name"));
	fname.sendKeys("Natesh");
	WebElement email = a.findElement(By.name("email_add"));
	email.sendKeys("natesh3016.n3@gmail.com");
	Thread.sleep(10000);
	WebElement click = a.findElement(By.xpath("//input[@type='checkbox']"));
	click.click();
	Thread.sleep(3000);
	WebElement reg = a.findElement(By.xpath("//input[@type='submit']"));
	reg.click();
	WebElement clb = a.findElement(By.xpath("//a[text()='Go back to Login page']"));
	clb.click();
	WebElement uu = a.findElement(By.xpath("//input[@type='text']"));
	uu.sendKeys("nateshnsns");
	Thread.sleep(3000);
	WebElement pss = a.findElement(By.xpath("//input[@type='password']"));
	pss.sendKeys("JumpJump@!44");
	WebElement login = a.findElement(By.xpath("//input[@type='Submit']"));
	login.click();
	
	
	
	
	
	
	
	
	
	}

}


