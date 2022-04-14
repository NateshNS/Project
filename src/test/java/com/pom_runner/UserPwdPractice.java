package com.pom_runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PageobjectModel.AdactinBookNow;
import com.PageobjectModel.AdactinHomePage;
import com.PageobjectModel.AdactinHotelConfirmation;
import com.PageobjectModel.AdactinLogout;
import com.PageobjectModel.AdactinSearchHotel;
import com.ProjectClass.Base_Class;
import com.pageObjectManager.Page_Object_Managerr;


public class UserPwdPractice extends Base_Class  {
	public static WebDriver driver;
	//public static Page_Object_Managerr pom=new Page_Object_Managerr(driver);
	
	public static void main(String[] args) throws InterruptedException {
		
		driver=set("chrome");
		get("https://adactinhotelapp.com/");
//		AdactinHomePage hp=new AdactinHomePage(driver);
//		AdactinSearchHotel hh=new  AdactinSearchHotel(driver);
//		AdactinHotelConfirmation ii=new AdactinHotelConfirmation(driver);
//		AdactinBookNow jj=new AdactinBookNow(driver);
//		AdactinLogout kk=new AdactinLogout(driver);
		
		//WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
	//	user.sendKeys("nateshnsns");
	//	input(hp.getUser(),"nateshnsns");
		Page_Object_Managerr pom=new Page_Object_Managerr(driver);
		
		input(pom.getHp().getUser(),"nateshnsns");
		
		//WebElement pwd = driver.findElement(By.name("password"));
	//	pwd.sendKeys("3EE419");
	//	input(hp.getPwd(), "3EE419");
		input(pom.getHp().getPwd(), "3EE419");
	//	WebElement log = driver.findElement(By.name("login"));
		//log.click();
	//	clickbtn(hp.getLog());
		clickbtn(pom.getHp().getLog());
		
		
	//	dropdown(hh.getLoc(), "index", "5");
		dropdown(pom.getHh().getLoc(), "index", "5");
		
	//	dropdown(hh.getHotel(), "visible text", "Hotel Hervey");
		dropdown(pom.getHh().getHotel(), "visible text", "Hotel Hervey");
		
		//dropdown(hh.getRtype(), "value", "Double");
		dropdown(pom.getHh().getRtype(),"value", "Double");
		//dropdown(hh.getRno(), "index", "3");
		dropdown(pom.getHh().getRno(), "index", "3");
		
	//	input(hh.getCheckin(), "20/03/2022");
		input(pom.getHh().getCheckin(),"20/03/2022");
	//	input(hh.getCheckout(), "23/03/2022");
		input(pom.getHh().getCheckout(),"23/03/2022");
	//	dropdown(hh.getAroom(), "index", "3");
		dropdown(pom.getHh().getAroom(),"index","3");
	//	dropdown(hh.getCroom(), "index", "1");
		dropdown(pom.getHh().getCroom(),"index","1");
	//	clickbtn(hh.getSearch());
		clickbtn(pom.getHh().getSearch());
	//	clickbtn(ii.getRadio());
		clickbtn(pom.getIi().getRadio());
	//	clickbtn(ii.getCon());
		clickbtn(pom.getIi().getCon());
	//	input(jj.getFname(), "NATESH");
		input(pom.getJj().getFname(),"NATESH");
	//	input(jj.getLname(), "ns");
		input(pom.getJj().getLname(),"ns");
	//	input(jj.getBaddress(), "choolai");
		input(pom.getJj().getBaddress(),"choolai");
	//	input(jj.getCreditno(),"1477 1456 8529 6325");
		input(pom.getJj().getCreditno(),"1477 1456 8529 6325");
	//	dropdown(jj.getCretype(), "index", "2");
		dropdown(pom.getJj().getCretype(), "index", "2");
	//	dropdown(jj.getExpmon(), "index", "4");
		dropdown(pom.getJj().getExpmon(),"index","4");
	//	dropdown(jj.getExpyr(), "index", "5");
		dropdown(pom.getJj().getExpyr(),"index", "5");
	//	input(jj.getCvvno(), "725");
		input(pom.getJj().getCvvno(), "725");
	//	clickbtn(jj.getBook());
		clickbtn(pom.getJj().getBook());
		Thread.sleep(7000);
	//	clickbtn(kk.getLout());
		clickbtn(pom.getKk().getLout());
		
		
		
		
		
		
		
		
		
	
		
	}

}

