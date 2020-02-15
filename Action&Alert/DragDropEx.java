 package com.MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class DragDropEx  {
public static void main(String[] args)throws Exception {
	WebDriver d= new FirefoxDriver();
	//RemoteWebDriver d;
	//DriverCommand
	//RemoteWebElement ele;
	d.manage().window().maximize();
	d.get("http://demo.guru99.com/test/drag_drop.html");
	Thread.sleep(3000);
	//d.switchTo().frame(0);
	WebElement e = d.findElement(By.xpath("//*[@id='credit2']/a"));
	WebElement e1 = d.findElement(By.xpath("//*[@id='shoppingCart1']"));
	
	Actions a= new Actions(d);
	a.dragAndDropBy(e,146,117).build().perform();
   // a.clickAndHold(e).moveToElement(e1).release(e).build().perform();
	
		
		
	
}
}
