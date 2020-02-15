package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoIt {
@Test
public void test1() throws Exception {
	WebDriver d= new FirefoxDriver();
	d.get("file:///C:/Users/mangesh/Desktop/fileupload.html");
	d.findElement(By.xpath(".//*[@id='1']")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\mangesh\\Desktop\\AutoIT\\fileupload.exe");
	Thread.sleep(3000);
}

}
