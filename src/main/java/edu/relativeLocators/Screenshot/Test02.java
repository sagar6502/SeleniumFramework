package edu.relativeLocators.Screenshot;

import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;

public class Test02 {
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://smallpdf.com/jpg-to-pdf";
	
	@Test(alwaysRun = true)
	public void launchBrowser() {
		reFunc.launchURL(browserLink);
	}
	
	
	@Test(dependsOnMethods = "launchBrowser")
	public void validate_UseAutoIt() throws Exception {
		reFunc.useAutoIt();
	}
	
	@Test(dependsOnMethods = "validate_UseAutoIt", enabled = false)
	public void closeDriver() {
		reFunc.closeDriver();
	}
}
