package edu.relativeLocators.Screenshot;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GenericLibrary.SagarGenericLib;

public class Test02 {
	SagarGenericLib reFunc = new SagarGenericLib();
	String browserLink = "https://smallpdf.com/jpg-to-pdf";
	
	@BeforeTest(alwaysRun = true)
	public void launchBrowser() throws IOException {
		reFunc.launchURL(browserLink);
	}
	
	
	@Test
	public void validate_UseAutoIt() throws Exception {
		reFunc.useAutoIt();
	}
	
}
