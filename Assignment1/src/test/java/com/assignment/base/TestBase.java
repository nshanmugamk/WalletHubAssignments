package com.assignment.base;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.assignment.utilities.ExtentListeners;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	public static WebDriver driver= null;
	public static WebDriverWait wait= null;	
	public static Logger log = Logger.getLogger("devpinoyLogger");
	
	StringBuilder builder = new StringBuilder();
	
	//test url is parametarized as i have added both the project in the same framework
	@Parameters({"testsiteurl"})
	
	
	/*Follwoing E2E testing approach so Login once complete test and Logout once is the approach so the below method sets what browser 
	 * maximizes window , page load and imlisite wait timeouts are defined 
	 */
	
	@BeforeSuite(alwaysRun = true)
	public void startup(String testsiteurl) {
	
			
			if(Config.browser.equals("firefox"))
			{
				
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions options = new FirefoxOptions();
				options.setProfile(new FirefoxProfile());
				options.addPreference("dom.webnotifications.enabled", false);
				driver = new FirefoxDriver(options);
				log.debug("launching chrome firefox");
			
			}else if(Config.browser.equals("chrome")){
				WebDriverManager.chromedriver().setup();				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(options);
				log.debug("launching chrome driver");
				
			}else if(Config.browser.equals("ie")){
				WebDriverManager.iedriver().setup();	
				driver = new InternetExplorerDriver();
				log.debug("launching IE");
			}			
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		driver.get(testsiteurl); //testurl is parameterised , testsiteUrl needs to be updated in testNg.xml file
		
	}
	
	//is the method used to close all the opened browser
	@AfterSuite(alwaysRun = true)
	public void tearDown()
	{
		try {
			if(driver!=null)
			{
				driver.close();
				driver.quit();
				driver=null;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	//==============================Click method to click on an Element =======================================
	
	public void click(WebElement element, String elementName)                                     
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));  //before checking waiting till the element is clickable
		element.click();											//click action is performed
		ExtentListeners.testReport.get().log(Status.INFO,"Clicking on : " + elementName);   //Extent report loggin 
		log.debug("Clicking on : "+ elementName);											//Application log

	}
	
	
	//=========================== Enter text method ==================================
	
	public static void type(WebElement element, String value , String elementName) {
		
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		ExtentListeners.testReport.get().log(Status.INFO,"Typing in: " + elementName+" Entered the value as "+value);
		log.debug("Typing in: " + elementName+" Entered the value as "+value);


	}
	
	
	
	//======================= Send text using Action class================================
	
	public void typeUsingActionMethod(WebElement element, String value, String elementName)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).sendKeys(value).build().perform();
		ExtentListeners.testReport.get().log(Status.INFO,"Typing in: " + elementName+" Entered the value as "+value);
		log.debug("Typing in: " + elementName+" Entered the value as "+value);
		
	}
	
	//========================= Move to element using java script executor =====================================
	
	public void moveToElementUsingJS(WebElement element , String elementName)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);	
		ExtentListeners.testReport.get().log(Status.INFO,"Move to element: " + elementName );
		log.debug("Move to element: " + elementName );
		
	}
	
	//================================= mouse Move Over =========================
	
	public void mouseMoveOver(WebElement element, String elementName)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		ExtentListeners.testReport.get().log(Status.INFO,"Mouse Move over an element : " + elementName );
		log.debug("Mouse Move over an element : " + elementName);
	}
	
	
	//======================generate Random String ================================
	
	public String RandomeString(int numText)
	{
		Random r = new Random();
		for (int i = 0; i < numText; i++) {			
			char c = (char)(r.nextInt(26) +'a');			
			builder.append(c);						
		
	}
		String rbuilder = builder.toString();
		return rbuilder;
	}
	
	//=============================== get Text of an element ========================
	
	public String getText(WebElement element, String elementName)
	{
		wait.until(ExpectedConditions.visibilityOf(element));
		ExtentListeners.testReport.get().log(Status.INFO,"Get text of an element : " + elementName );
		log.debug("Get text of an element : " + elementName);
		return element.getText();
		
		
	}
	
	
	//============================== get Attribute value from an element ===============================
	
	
	public String getAttribute(WebElement element, String attribute, String elementName)
	{
		ExtentListeners.testReport.get().log(Status.INFO,"Get text of an element : " + elementName + " and the attribute is "+attribute);
		log.debug("Get text of an element : " + elementName + " and the attribute is "+attribute);
		return element.getAttribute(attribute);
	}

	
	
	
	}


