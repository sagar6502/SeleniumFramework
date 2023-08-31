package edu.Factory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestivedropdwn {
	public static void main(String args[]) throws InterruptedException {
		WebDriver c=new ChromeDriver();
c.get("https://rahulshettyacademy.com/dropdownsPractise/");
Thread.sleep(5000);
c.findElement(By.id("autosuggest")).sendKeys("ind");
List<WebElement> v=c.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
for(WebElement q:v)
{
	if(q.getText().equalsIgnoreCase("India")) {
		q.click();
		break;
	}
		
}
	}

}


