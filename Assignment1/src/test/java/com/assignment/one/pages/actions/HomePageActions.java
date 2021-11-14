package com.assignment.one.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.assignment.base.TestBase;
import com.assignment.one.pages.loactors.HomePageLocators;

public class HomePageActions extends TestBase {
	
	public HomePageLocators homePage;
	
	public HomePageActions()
	{
		this.homePage= new HomePageLocators();
		PageFactory.initElements(TestBase.driver, this.homePage);
	}
	
	public void clickOnPostTxtField()
	{
		click(homePage.postTxtField, "PostTextAreaFeild");
		
	}
	
	public void clickOnHomeIcon()
	{
		click(homePage.homeIcon,"HomeIcon");
	}
	
	public void clickOnPopUpPostTxtFeild()
	{
		click(homePage.postPopupTxtField,"POP up text feild");
	}
	
	public void enterPostText(String postMessage)
	{
		typeUsingActionMethod(homePage.postPopupTxtField, postMessage , "post text field ");
	}
	
	public void clickOnPostBtn()
	{
		click(homePage.postBtn, "post button");
	}
	


}
