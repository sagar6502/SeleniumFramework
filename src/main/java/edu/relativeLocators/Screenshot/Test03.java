package edu.relativeLocators.Screenshot;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;

public class Test03 {
	
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://www.spicejet.com/";
	
	@BeforeTest(alwaysRun = true)
	public void launchBrowser() throws IOException {
		reFunc.launchURL(browserLink);
	}
	
	
	@Test
	public void validate_CalendarHandling() throws Exception {
		reFunc.bookFlight();
		Thread.sleep(5000);
	}
	
	@AfterTest(alwaysRun = true)
	public void closeDriver() {
		reFunc.closeDriver();
	}
}
