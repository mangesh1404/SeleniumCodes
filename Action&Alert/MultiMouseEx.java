package com.MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiMouseEx {

public static void main(String[] args)throws Exception {
	WebDriver d= new FirefoxDriver();
	d.get("https://www.carmax.com/");
	d.manage().window().maximize();
	Thread.sleep(2000);
	Actions a = new Actions(d);
	WebElement e = d.findElement(By.linkText("CARS FOR SALE"));
	a.moveToElement(e).build().perform();
	Thread.sleep(3000);
	
	WebElement e1 = d.findElement(By.linkText("SELL YOUR CAR"));
	a.moveToElement(e1).build().perform();
	Thread.sleep(3000);
	
	WebElement e2 = d.findElement(By.linkText("FINANCING"));
	a.moveToElement(e2).build().perform();
	Thread.sleep(3000);
}
}
