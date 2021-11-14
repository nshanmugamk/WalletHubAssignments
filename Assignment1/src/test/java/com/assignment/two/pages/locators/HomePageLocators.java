package com.assignment.two.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	@FindBy(xpath=("(//*[@class='brgm-list-title'])[3]"))
	public WebElement profileNameMenu;
	
	@FindBy(xpath=("//span[@role='button'][normalize-space()='Logout']"))
	public WebElement logoutDropDownOption;


}
