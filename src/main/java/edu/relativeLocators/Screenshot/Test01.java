package edu.relativeLocators.Screenshot;

import java.io.File;

import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;

public class Test01 {
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://rahulshettyacademy.com/angularpractice/";
	static String filePath = System.getProperty("user.dir")+ File.separatorChar+"src"+File.separatorChar+"main"+File.separatorChar+"java"+File.separatorChar+"edu"+File.separatorChar+"driver"+File.separatorChar+"Automation.properties";
	
	@Test(alwaysRun = true)
	public void launchBrowser() {
		System.out.println(filePath);
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
