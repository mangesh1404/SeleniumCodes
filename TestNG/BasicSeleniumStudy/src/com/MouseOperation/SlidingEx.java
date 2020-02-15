package com.MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SlidingEx {
public static void main(String[] args) throws Exception {
	WebDriver d = new FirefoxDriver();
	d.manage().window().maximize();
	d.get("https://jqueryui.com/slider/");
	Thread.sleep(2000);
	d.switchTo().frame(0);
	WebElement e = d.findElement(By.xpath(".//*[@id='slider']/span"));
	Actions a= new Actions(d);
	a.clickAndHold(e).moveByOffset(360, 0).release(e).build().perform();
}
}
