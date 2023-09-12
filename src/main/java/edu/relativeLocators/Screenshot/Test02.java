package edu.relativeLocators.Screenshot;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;

public class Test02 {
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://smallpdf.com/jpg-to-pdf";
	
	@BeforeTest(alwaysRun = true)
	public void launchBrowser() {
		reFunc.launchURL(browserLink);
	}
	
	
	@Test
	public void validate_UseAutoIt() throws Exception {
		reFunc.useAutoIt();
	}
	
	@AfterTest(alwaysRun = true)
	public void closeDriver() {
		reFunc.closeDriver();
	}
}
