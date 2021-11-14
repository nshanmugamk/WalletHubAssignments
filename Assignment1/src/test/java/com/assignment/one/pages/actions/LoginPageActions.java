package com.assignment.one.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.assignment.base.TestBase;
import com.assignment.one.pages.loactors.LoginPageLocators;

public class LoginPageActions extends TestBase{
	
	public LoginPageLocators loginPage;
	
	public LoginPageActions()
	{
		this.loginPage = new LoginPageLocators();
		PageFactory.initElements(TestBase.driver, this.loginPage);
		
	}
	
	public void enterUserName(String username)
	{
		type(loginPage.loginTxtFeild, username ,"user name text feild");		
	}
	
	public void enterPassword(String password)
	{
		type(loginPage.passwordTxtFeild, password , "Password text feild");		
	}
	
	public void clickOnLogin()
	{
		click(loginPage.loginBtn,"Login buttom");		
	}
	
	
	

}
