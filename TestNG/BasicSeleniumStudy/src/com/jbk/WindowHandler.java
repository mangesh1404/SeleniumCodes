package com.jbk;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandler {
public static void main(String[] args) throws InterruptedException {
	WebDriver d= new FirefoxDriver();
	d.get("https://demo.guru99.com/popup.php");
	d.findElement(By.xpath("html/body/p/a")).click();
	String mainwin= d.getWindowHandle();
	Set<String>s1=d.getWindowHandles();
	Iterator<String> itr= s1.iterator();
	while(itr.hasNext()) {
		String childwin=itr.next();
		if(!mainwin.equalsIgnoreCase(childwin)) {
			d.switchTo().window(childwin);
			Thread.sleep(3000);
			d.close();
			System.out.println(childwin);
		}
	}
	d.switchTo().window(mainwin);
	System.out.println(mainwin);
	
	
}
}
