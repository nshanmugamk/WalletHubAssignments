package com.assignment.two.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocator {
	
	@FindBy(xpath="//a[@class='login']")
	public WebElement loginIcon;	
	@FindBy(id="email")
	public WebElement loginTxtBox;
	@FindBy(id="password")
	public WebElement passwordTxtBox;
	@FindBy(xpath="//button[contains(.,'Login')]")
	public WebElement loginBtn;
	

}
