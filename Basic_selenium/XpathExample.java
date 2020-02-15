package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class XpathExample {
	WebDriver driver= new FirefoxDriver();
	@Test
	public void TC01() {
	driver.get("file:///D:/Java%20study/Selenium%20Software/Offline%20Website/index.html");
	
	driver.findElement(By.xpath("//input[@id='email']"));
	driver.findElement(By.xpath(""));
	driver.findElement(By.xpath(""));
	driver.findElement(By.xpath(""));
	driver.findElement(By.xpath(""));
	driver.findElement(By.xpath(""));
	driver.findElement(By.xpath(""));
	
	}
	
	
	
	
	
	
	
}
