package com.assignment.two.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.assignment.base.TestBase;
import com.assignment.two.pages.locators.LoginPageLocator;

public class LoginPageActions extends TestBase{
	
	public LoginPageLocator loginpage;
	
	public LoginPageActions()
	{
		this.loginpage = new LoginPageLocator();
		PageFactory.initElements(TestBase.driver, loginpage);
	}
	
	public void login(String username , String password)
	{
		clickOnLoginIcon();
		enterUsername(username);
		enterpassword(password);
		clickOnLoginBtn();		
	}
	
	public void enterUsername(String userName){
		type(loginpage.loginTxtBox, userName,"Username text feild");		
	}
	
	public void enterpassword(String password){
		type(loginpage.passwordTxtBox, password, "Password text feild");		
	}
	
	public void clickOnLoginBtn(){
		click(loginpage.loginBtn, "LoginButton");		
	}
	
	public void clickOnLoginIcon(){
		click(loginpage.loginIcon, "Login icon on top left");		
	}
	
	
	
	
	

}
