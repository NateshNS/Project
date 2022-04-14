package com.pageObjectManager;

import org.openqa.selenium.WebDriver;

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

public class Automation_Practice_pageobjectmanager {
	public static WebDriver driver;
	
	private Automation_HomePage b;
	private AutomationShopping_LoginPage c;
	private Adactin_Booking_Page d;
	private Automoation_Dress_Selection1 e;
	private Automation_casual_dress f;
	private Automation_Add_To_Cart g;
	private Automation_Proceedtocheckout1 h;
	private Automation_Proceedtocheckout2 i;
	private Automation_Radio k;
	private Automation_Proceedtocheckout3 j;
	private Automation_paybywire l;
	private Automation_confirmorder m;
	private Proceed_checkout4 n;
	private Automation_Logout o;
	public Automation_Practice_pageobjectmanager(WebDriver driver2) {
		    this.driver=driver2;
	}
	public Automation_HomePage getB() {
		b=new Automation_HomePage(driver);
		return b;
	}
	public AutomationShopping_LoginPage getC() {
		c=new AutomationShopping_LoginPage(driver);
		return c;
	}
	public Adactin_Booking_Page getD() {
		d=new Adactin_Booking_Page(driver);
		return d;
	}
	public Automoation_Dress_Selection1 getE() {
		e=new Automoation_Dress_Selection1(driver);
		return e;
	}
	public Automation_casual_dress getF() {
		f=new Automation_casual_dress(driver);
		return f;
	}
	public Automation_Add_To_Cart getG() {
		g=new Automation_Add_To_Cart(driver);
		return g;
	}
	public Automation_Proceedtocheckout1 getH() {
		h=new Automation_Proceedtocheckout1(driver);
		return h;
	}
	public Automation_Proceedtocheckout2 getI() {
		i=new Automation_Proceedtocheckout2(driver);
		return i;
	}
	public Automation_Radio getK() {
		k=new Automation_Radio(driver);
		return k;
	}
	public Automation_Proceedtocheckout3 getJ() {
		j=new Automation_Proceedtocheckout3(driver);
		return j;
	}
	public Automation_paybywire getL() {
		l=new Automation_paybywire(driver);
		return l;
	}
	public Automation_confirmorder getM() {
		m=new Automation_confirmorder(driver);
		return m;
	}
	public Proceed_checkout4 getN() {
		n=new Proceed_checkout4(driver);
		return n;
	}
	public Automation_Logout getO() {
		o=new Automation_Logout(driver);
		return o;
	}
	
	

}
