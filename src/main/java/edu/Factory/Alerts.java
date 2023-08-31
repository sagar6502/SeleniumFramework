package edu.Factory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.findElement(By.id("name")).sendKeys("sinchana");
		d.findElement(By.id("alertbtn")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();
		d.findElement(By.id("confirmbtn")).click();
		System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().dismiss();
	}

}
