package com.jbk;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public final class LocatorsEx {
	WebDriver driver= new FirefoxDriver();
	@Test
	public void TC01() {
	driver.get("file:///D:/Java%20study/Selenium%20Software/Offline%20Website/index.html");
	
	driver.findElement(By.id("email"));
	driver.findElement(By.name("viewport"));
	driver.findElement(By.className("form-control"));
	driver.findElement(By.linkText("Register a new membership"));
	driver.findElement(By.partialLinkText("Register"));
	driver.findElement(By.tagName("a"));
	driver.findElement(By.cssSelector("input#email"));
	
	
	
	
	
	
	}
	
	
	
}
