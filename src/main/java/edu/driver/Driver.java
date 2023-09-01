package edu.driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {
	public static WebDriver driver;
	
	static String filePath = System.getProperty("user.dir")+ File.separatorChar+"src"+File.separatorChar+"main"+File.separatorChar+"java"+File.separatorChar+"edu"+File.separatorChar+"driver"+File.separatorChar+"Automation.properties";
	//static String filePath = "./src/main/java/edu/driver/Automation.properties";
	public WebDriver invokeDriver(){
		try {
			if(readProperties().getProperty("Browser").equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\SeleniumLearning\\SeleniumProject\\src\\main\\resources\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--high-dpi-support=1", "--force-device-scale-factor=1.5");
				options.addArguments("--window-size=1920,1080");
				options.addArguments("--start-maximized");
				if(readProperties().getProperty("Headless").equalsIgnoreCase("true"))
					options.addArguments("--headless");
				driver = new ChromeDriver(options);
				
			}else if(readProperties().getProperty("Browser").equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		return driver;
	}
	//reading properties file
	public Properties readProperties() throws IOException {
		Properties properties = new Properties();
		FileInputStream input = new FileInputStream(filePath);
	    properties.load(input);
	    return properties;
	}
}
