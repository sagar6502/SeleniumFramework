package edu.Factory;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(d.findElements(By.tagName("a")).size());
		WebElement a=d.findElement(By.id("gf-BIG"));//scope of webdriver[a] limited to footer section 
		System.out.println(a.findElements(By.tagName("a")).size());
		WebElement coloumdriver=a.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));   //1st coloumn in footer section
		int count=coloumdriver.findElements(By.tagName("a")).size();
		System.out.println(count); 
		
		for(int i=1;i<count;i++) {
			String keystoopenwin =Keys.chord(Keys.CONTROL,Keys.ENTER);    // CHORD - if we want to use multiple keys simultaneously 
			coloumdriver.findElements(By.tagName("a")).get(i).sendKeys(keystoopenwin);
			
		} // for to open all the tabs
		Thread.sleep(4000);
		Set<String> mw=d.getWindowHandles();
		Iterator<String> v= mw.iterator();
		while(v.hasNext()) {
			d.switchTo().window(v.next());
			System.out.println(d.getTitle());
		} // while to print titles of all windows
		
		
		
	}

}
