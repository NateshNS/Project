package com.pom_runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PageobjectModel.Adactin_Booking_Page;
import com.PageobjectModel.AutomationShopping_LoginPage;
import com.PageobjectModel.Automation_Add_To_Cart;
import com.PageobjectModel.Automation_HomePage;
import com.PageobjectModel.Automation_Logout;
import com.PageobjectModel.Automation_Proceedtocheckout1;
import com.PageobjectModel.Automation_Proceedtocheckout2;
import com.PageobjectModel.Automation_Proceedtocheckout3;
import com.PageobjectModel.Automation_Radio;
import com.PageobjectModel.Automation_casual_dress;
import com.PageobjectModel.Automation_confirmorder;
import com.PageobjectModel.Automation_paybywire;
import com.PageobjectModel.Automoation_Dress_Selection1;
import com.PageobjectModel.Proceed_checkout4;
import com.ProjectClass.Base_Class;
import com.pageObjectManager.Automation_Practice_pageobjectmanager;

public class Automation_Shopping extends Base_Class {
	public static WebDriver driver=Base_Class.set("chrome");
	public static void main(String[] args) throws Throwable {
		get("http://automationpractice.com/index.php");
		waits();
		Automation_Practice_pageobjectmanager pp=new Automation_Practice_pageobjectmanager(driver);
		clickbtn(pp.getB().getSign());
		String reademail = read_automation_data("C:\\Users\\N S Natesh\\Desktop\\general details.xlsx", 2, 1, 5);
		input(pp.getC().getEma(),reademail);
		String readpwd = read_automation_data("C:\\Users\\N S Natesh\\Desktop\\general details.xlsx", 2, 2, 5);
		input(pp.getC().getPwd(),readpwd);
		clickbtn(pp.getC().getSignin());
		clickbtn(pp.getD().getWomen());
		clickbtn(pp.getE().getDress());
		clickbtn(pp.getF().getCasualdress());
		clickbtn(pp.getG().getAddtocart());
		clickbtn(pp.getH().getProceed1());
		clickbtn(pp.getI().getProceedcheckout());
		clickbtn(pp.getJ().getProceed3());
		clickbtn(pp.getK().getRadio());
		clickbtn(pp.getN().getProceed4());
		clickbtn(pp.getL().getPay());
		clickbtn(pp.getM().getConfirm());
		clickbtn(pp.getO().getSignout());		
	}
}
