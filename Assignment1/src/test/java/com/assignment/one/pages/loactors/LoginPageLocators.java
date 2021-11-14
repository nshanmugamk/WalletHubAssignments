package com.assignment.one.pages.loactors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(id="email")
	public WebElement loginTxtFeild;
	
	@FindBy(id="pass")
	public WebElement passwordTxtFeild;
	
	@FindBy(name="login")
	public WebElement loginBtn;
	
	@FindBy(linkText="Forgotten password?")
	public WebElement forgotPasswordLink;

}
