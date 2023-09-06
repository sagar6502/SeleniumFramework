package edu.Factory;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver d=new ChromeDriver();
		d.get("https://the-internet.herokuapp.com/dynamic_loading/1	");
		d.findElement(By.cssSelector("div[id='start'] button")).click();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(d).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		WebElement q =wait.until(new Function<WebDriver,WebElement>()
		{
			public WebElement apply(WebDriver d) {
				if  (d.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			return d.findElement(By.cssSelector("[id='finish'] h4"));
				else
					return null;
				}
		}
		);
		System.out.println( d.findElement(By.cssSelector("[id='finish'] h4")).getText());

	}

}
