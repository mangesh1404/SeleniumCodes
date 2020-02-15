package com.MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOperation extends Object {
public static void main(String[] args) throws Exception {
	WebDriver d= new FirefoxDriver();
	d.get("https://www.facebook.com");
	d.manage().window().maximize();
	Thread.sleep(5000);
	WebElement e = d.findElement(By.xpath(".//*[@id='email']"));
			e.sendKeys("java program");
	Actions a = new Actions(d);
	Action a1= a.contextClick(e).build();
	a1.perform();
	e.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);
	e.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);
	e.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);
	e.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(5000);
	e.sendKeys(Keys.ENTER);
	
	
	
	
}
}
