package com.ListenersEx;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GetScreenShot {
	 static WebDriver  d;
  @Test
  public static String capture(String screenshotname)throws Exception {
	  TakesScreenshot ts = (TakesScreenshot)CaptureTest.d;
	  File src = ts.getScreenshotAs(OutputType.FILE);
	  String dest = "D:\\Arpit\\b.png";
	  File d = new File(dest);
	  FileUtils.copyFile(src, d);
	  return dest;
	  
	  
	  
	  
	  
  }
}
