package com.MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeEx {
public static void main(String[] args)throws Exception {
	WebDriver d= new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://jqueryui.com/resizable/");
	d.switchTo().frame(0);
	WebElement e = d.findElement(By.xpath(".//*[@id='resizable']/div[3]"));
	Actions a= new Actions(d);
	a.clickAndHold(e).moveByOffset(360, 180).release().build().perform();
	
	
}
}
