package com.jbk;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertEx {
public static void main(String[] args) {
	System.getProperty("webdriver.chrome.driver","C://chromedriver.exe");
	WebDriver d= new FirefoxDriver();
	d.get("http://demo.guru99.com/test/delete_customer.php");
	d.findElement(By.xpath("//input[@type='text']")).sendKeys("53920");
	d.findElement(By.xpath("//input[@type='submit']")).click();
	Alert al= d.switchTo().alert();
	String alertmsg= al.getText();
	System.out.println(alertmsg);
	al.accept();
}
}
