package com.assignment.one.pages.loactors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath="//span[contains(text(),\"What's on your mind\")]")
	public WebElement postTxtField;
	
	@FindBy(xpath="//div[@data-block='true']//div")
	public WebElement postPopupTxtField;	
	
	@FindBy(xpath="//div[@role='banner']//li[1]")
	public WebElement homeIcon;
	
	@FindBy(xpath="//div[@aria-label='Post']")
	public WebElement postBtn;
	
	@FindBy(xpath="//div[@aria-label='Account']")
	public WebElement accountIcon;
	
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	public WebElement logOutIcon;


}
