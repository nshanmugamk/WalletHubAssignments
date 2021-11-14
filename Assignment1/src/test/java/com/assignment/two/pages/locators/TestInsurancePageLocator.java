package com.assignment.two.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestInsurancePageLocator {
	
	@FindBy(xpath="(//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[1]")
	public WebElement reviewStar_1;
	@FindBy(xpath="(//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[2]")
	public WebElement reviewStar_2;
	@FindBy(xpath="(//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[3]")
	public WebElement reviewStar_3;
	@FindBy(xpath="(//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[4]")
	public WebElement reviewStar_4;
	@FindBy(xpath="(//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[5]")
	public WebElement reviewStar_5;
	
	@FindBy(xpath="((//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[1]//*[local-name()='path'])[2]")
	public WebElement selecteRreviewStar_1;
	@FindBy(xpath="((//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[2]//*[local-name()='path'])[2]")
	public WebElement selecteRreviewStar_2;
	@FindBy(xpath="((//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[3]//*[local-name()='path'])[2]")
	public WebElement selecteRreviewStar_3;
	@FindBy(xpath="((//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[4]//*[local-name()='path'])[2]")
	public WebElement selecteRreviewStar_4;
	@FindBy(xpath="((//div[@class='rv review-action ng-enter-element']//div[@class='rating-box-wrapper']//*[name()='svg'])[5]//*[local-name()='path'])[2]")
	public WebElement selecteRreviewStar_5;
	@FindBy(xpath="//span[normalize-space()='Select...']")
	public WebElement selectDropDown;
	
	@FindBy(xpath="//li[contains(.,'Health Insurance')]")
	public WebElement helthInsuranceOption;
	@FindBy(xpath="//textarea[@placeholder='Write your review...']")
	public WebElement reviewTextArea;
	@FindBy(xpath="//div[contains(text(),'Submit')]")
	public WebElement submitBtn;
	@FindBy(xpath="//div[contains(text(),'Continue')]")
	public WebElement continueBtn;
	@FindBy(xpath="(//*[@itemprop='description'])[2]")
	public WebElement latestDescriptionFeild;

	
	
	

	

}
