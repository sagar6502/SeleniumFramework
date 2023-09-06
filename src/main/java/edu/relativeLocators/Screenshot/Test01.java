package edu.relativeLocators.Screenshot;

import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;

public class Test01 {
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://rahulshettyacademy.com/angularpractice/";
	
	@Test(alwaysRun = true)
	public void launchBrowser() {
		reFunc.launchURL(browserLink);
	}
	
	
	@Test(dependsOnMethods = "launchBrowser")
	public void validate_TakeScreenshot() {
		reFunc.takeFullScreenShot();
	}
	
	@Test(dependsOnMethods = "validate_TakeScreenshot")
	public void closeDriver() {
		reFunc.closeDriver();
	}

}
