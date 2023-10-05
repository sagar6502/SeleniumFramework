package edu.relativeLocators.Screenshot;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;
import io.qameta.allure.Description;

public class Test4 {
	
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://jwt.io/";
	
	@BeforeTest(alwaysRun = true)
	public void launchBrowser() {
		reFunc.launchURL(browserLink);
	}
	
	@Description("JWT JSON Object assigned by Manish sir and Madhura")
	@Test
	public void scrapJWT() throws Exception {
		reFunc.scrapJWT();
		Thread.sleep(5000);
	}

}
