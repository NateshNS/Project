package com.ProjectClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThirtyTwoMethods {
	public static WebDriver driver;
	public static WebDriver set(String types) {
		if(types.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\driver\\chromedriver.exe" );
		 driver=new ChromeDriver();}
		else if (types.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\driver\\geckodriver.exe" );
					driver=new FirefoxDriver();}
	
		return driver;
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void navigate(String URL) {
		driver.navigate().to(URL);
		}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navigateforward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void get(String URL) {
		driver.get(URL);	
	}
	public static void salert() {
		driver.switchTo().alert().accept();
	}
	public static void calertaccept() {
		driver.switchTo().alert().accept();
	}
	public static void calertdismiss() {
		driver.switchTo().alert().dismiss();	
	}
	public static void promptalert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	
	public static void click(WebElement cli) {
		cli.click();
	}
	public static void waits() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public static void sendkeys(WebElement Element,String Value) {
		Element.sendKeys(Value);
		}
	public static void Takesscreenshot(String path) throws Throwable {
		TakesScreenshot ss=(TakesScreenshot)driver;
		File srcfile=ss.getScreenshotAs(OutputType.FILE);
		File destination=new File(path);
		FileUtils.copyFile(srcfile, destination);
		
		
	}
	}


