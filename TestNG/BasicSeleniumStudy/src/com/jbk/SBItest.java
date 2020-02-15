package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SBItest {

	public static void main(String[] args) {
		WebDriver wd = new FirefoxDriver();
		 wd.get("https://www.onlinesbi.com/");
		 System.out.println("1");
		 String url = wd.getCurrentUrl();
		  System.out.println(url);
		  System.out.println("2");
         wd.findElement(By.xpath(".//*[@id='banking']/div[1]/div/div/a[1]/span[1]")).click();
         System.out.println("3");
         wd.findElement(By.xpath(".//*[@id='banner']/div[2]/a")).click();
         System.out.println("4");
         wd.findElement(By.id("username")).sendKeys("VYAHALKAR123");
         wd.findElement(By.id("label2")).sendKeys("123NIRMALA");
         System.out.println("5");
         wd.findElement(By.xpath(".//*[@id='Button2']")).click();
         System.out.println("6");
	}

}
