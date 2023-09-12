package edu.relativeLocators.Screenshot;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;

public class Test01 {
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://rahulshettyacademy.com/angularpractice/";
	
	@BeforeTest(alwaysRun = true)
	public void launchBrowser() {
		reFunc.launchURL(browserLink);
	}
	
	
	@Test
	public void validate_TakeScreenshot() {
		reFunc.takeFullScreenShot();
	}
	
	@AfterTest(alwaysRun = true)
	public void closeDriver() {
		reFunc.closeDriver();
	}

}
