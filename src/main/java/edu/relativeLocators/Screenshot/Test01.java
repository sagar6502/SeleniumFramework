package edu.relativeLocators.Screenshot;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;
import edu.Factory.TestData;

public class Test01 {
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://www.makemytrip.com/";
	TestData datafactory;
	
	@BeforeTest(alwaysRun = true)
	public void launchBrowser() throws IOException {
		
		reFunc.launchURL(browserLink);
	}
	
	
	@Test
	public void validate_TakeScreenshot() throws IOException {
		datafactory.readData();
		reFunc.takeMakeMyTrip();
	}

}
