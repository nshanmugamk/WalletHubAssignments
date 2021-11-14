package com.assignment.two.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.assignment.base.TestBase;
import com.assignment.two.pages.locators.HomePageLocators;


public class HomePageActions extends TestBase {
	
	public HomePageLocators hp;
	
	public HomePageActions()
	{
		this.hp = new HomePageLocators();
	PageFactory.initElements(TestBase.driver, hp);
		
	}
	
	public void logOut()
	{
		mouseMoveOver(hp.profileNameMenu, "profile name menu");
		click(hp.logoutDropDownOption, "LogOutOPtion");
	}

}
