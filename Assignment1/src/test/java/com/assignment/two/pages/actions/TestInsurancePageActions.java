package com.assignment.two.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.assignment.base.TestBase;
import com.assignment.two.pages.locators.TestInsurancePageLocator;

public class TestInsurancePageActions extends TestBase{
	
	public TestInsurancePageLocator testinsurance;
	
	public TestInsurancePageActions()
	{
		this.testinsurance = new TestInsurancePageLocator();
		PageFactory.initElements(TestBase.driver, testinsurance);
		
	}
	
	public void navigateToUrl(String url)
	{
		driver.navigate().to(url);		
	}
	
	public void moveToRatingStars()
	{
		moveToElementUsingJS(testinsurance.selecteRreviewStar_1,"first star");		
	}
	
	public void mouseHoverOnFirstStar()
	{
		mouseMoveOver(testinsurance.reviewStar_1, "second star");
	}
	
	public void mouseHoverOnSecondStar()
	{
		mouseMoveOver(testinsurance.reviewStar_2,"third star");
	}
	
	public void mouseHoverOnThirdStar()
	{
		mouseMoveOver(testinsurance.reviewStar_3, "fourth star");
	}
	
	public void mouseHoverOnFourthStar()
	{
		mouseMoveOver(testinsurance.reviewStar_4, "fifth star");
	}
	
	public String starOneColorChange(String attribute)
	{
		return getAttribute(testinsurance.selecteRreviewStar_1, attribute , "color changed first star");
	}
	
	public String starTwoColorChange(String attribute)
	{
		return getAttribute(testinsurance.selecteRreviewStar_2, attribute , "color changed second star");
	}
	
	public String starThreeColorChange(String attribute)
	{
		return getAttribute(testinsurance.selecteRreviewStar_3, attribute , "color changed third star");
	}
	
	public String starFourColorChange(String attribute)
	{
		return getAttribute(testinsurance.selecteRreviewStar_4, attribute , "color changed fourth star");
	}
	
	public void clickOnSelectDropdown() {
		click(testinsurance.selectDropDown, "select dropdown");
	}
	
	public void selectHealthInsurance()
	{
		click(testinsurance.helthInsuranceOption,"HealthInsurance option");
	}
	
	public String enterReviuewText(int numText)
	{
		String stringEntered= RandomeString(numText);
		type(testinsurance.reviewTextArea, stringEntered , "review text area");
		return stringEntered;
	}
	
	public void clickOnSubmit()
	{
		click(testinsurance.submitBtn, "Submit button");
	}
	
	public void clickOnContinue()
	{
		click(testinsurance.continueBtn , "Continue button");
	}
	
	public String getLatestComment()
	{
		return getText(testinsurance.latestDescriptionFeild, "Latest comment feild");
	}	
	
	public void clickOnFourthStar()
	{
		click(testinsurance.reviewStar_4, "fourth star");
	}

}
