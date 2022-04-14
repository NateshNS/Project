package com.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.PageobjectModel.AdactinBookNow;
import com.PageobjectModel.AdactinHomePage;
import com.PageobjectModel.AdactinHotelConfirmation;
import com.PageobjectModel.AdactinLogout;
import com.PageobjectModel.AdactinSearchHotel;

public class Page_Object_Managerr {
	public static WebDriver driver;
	
	private AdactinHomePage hp;
	private AdactinSearchHotel hh;
	private AdactinHotelConfirmation ii;
	private AdactinBookNow jj;
	private AdactinLogout kk;
	
	
	public Page_Object_Managerr(WebDriver driver2) {
		this.driver=driver2;
	}
	public AdactinHomePage getHp() {
		 hp=new AdactinHomePage (driver);
		return hp;
	}
	public AdactinSearchHotel getHh() {
		hh=new AdactinSearchHotel (driver);
		return hh;
	}
	public AdactinHotelConfirmation getIi() {
		ii=new AdactinHotelConfirmation(driver);
		return ii;
	}
	public AdactinBookNow getJj() {
		jj=new AdactinBookNow(driver);
		return jj;
	}
	public AdactinLogout getKk() {
		kk=new AdactinLogout(driver);
		return kk;
	}
	
	

}
