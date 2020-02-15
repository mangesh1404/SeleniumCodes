package com.MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {
	public static void main(String[] args)throws Exception {
		WebDriver d = new FirefoxDriver();
		d.get("https://www.carmax.com/");
		d.manage().window().maximize();
	//	Thread.sleep(1000);
		WebElement e = d.findElement(By.linkText("CARS FOR SALE"));
		Actions a = new Actions(d);
		a.moveToElement(e).build().perform();
		
		WebElement e1= d.findElement(By.linkText("Why CarMax?"));
		a.moveToElement(e1).build().perform();
	} 
	

}

