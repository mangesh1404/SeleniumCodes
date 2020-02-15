package com.Action;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShotEx {
public static void main(String[] args) throws Exception {
	WebDriver d= new FirefoxDriver();
	d.get("http://www.facebook.com");
	d.manage().window().maximize();
	TakesScreenshot ts= (TakesScreenshot)d;
	File source= ts.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(source, new File("./Screenshots/Facebook.png"));
    System.out.println("Screenshot taken");
    
}
}
