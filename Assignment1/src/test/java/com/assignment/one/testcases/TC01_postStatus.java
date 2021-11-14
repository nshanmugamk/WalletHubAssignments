package com.assignment.one.testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.assignment.base.TestBase;
import com.assignment.one.pages.actions.HomePageActions;
import com.assignment.one.pages.actions.LoginPageActions;

public class TC01_postStatus extends TestBase
{
	@Test
	@Parameters({"username", "password"})
	public void tco1_postStatus(String username , String password)
	{
		//creating object of login page to access action methods
		LoginPageActions loginpage = new LoginPageActions();
		
		//creating object of Home page to access action method		
		HomePageActions hp = new HomePageActions();
		
		//entering username in the username text field 
		loginpage.enterUserName(username);;
		
		//entering password in the password text field 
		loginpage.enterPassword(password);
		
		//clicking on login button
		loginpage.clickOnLogin();
		
		//clicing on home icon to access post text field
		hp.clickOnHomeIcon();
		
		//clicking on post text field
		hp.clickOnPostTxtField();
		
		//entering post text field
		hp.enterPostText("Hello World");
		
		//clicked on post button
		hp.clickOnPostBtn();
		
		
		
	}
	

}
