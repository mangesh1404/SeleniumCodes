package com.jbk;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFile {
public static void main(String[] args) {
	

WebDriver driver = new FirefoxDriver();

driver.get("http://demo.guru99.com/test/yahoo.html");
WebElement downloadButton = driver.findElement(By.id("messenger-download"));
String sourceLocation = downloadButton.getAttribute("href");
String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;

try {
Process exec = Runtime.getRuntime().exec(wget_command);
int exitVal = exec.waitFor();
System.out.println("Exit value: " + exitVal);
} catch (InterruptedException | IOException ex) {
System.out.println(ex.toString());
}
driver.close();
}
}
