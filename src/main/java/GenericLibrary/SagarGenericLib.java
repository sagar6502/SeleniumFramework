package GenericLibrary;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import edu.Factory.ReusableFunction;
import edu.driver.Driver;


public class SagarGenericLib {

	public static Driver webDriver = new Driver();
	public static WebDriver driver = webDriver.invokeDriver();
	ReusableFunction reuseFunc = new ReusableFunction();
	
	public void launchURL(String link) {
		System.out.println(link);
		driver.get(link);
		Assert.assertEquals(driver.getCurrentUrl(), link);
	}
	
	public void takeFullScreenShot(){
		reuseFunc.takeFullScreenshot(driver);
		
	}
	
	
	public void closeDriver() {
		driver.quit();
	}
	
}
