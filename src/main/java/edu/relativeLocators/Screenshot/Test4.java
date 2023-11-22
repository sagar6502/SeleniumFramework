package edu.relativeLocators.Screenshot;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;
import edu.Factory.TestData;

public class Test4 {
	
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://jwt.io/";
	TestData data = new TestData();
	
	@Test(alwaysRun = true)
	public void launchBrowser() throws IOException {
		data.readData_Yes();
		//reFunc.launchURL(browserLink);
	}
	
	/*
	@Description("JWT JSON Object assigned by Manish sir and Madhura")
	@Test
	public void scrapJWT() throws Exception {
		reFunc.scrapJWT();
		Thread.sleep(5000);
	}
	*/
}
