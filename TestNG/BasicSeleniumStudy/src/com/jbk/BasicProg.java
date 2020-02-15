package com.jbk;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class BasicProg {
   public static void main(String[] args) {
	WebDriver d = new FirefoxDriver();
	d.get("file:///D:/Java%20study/Selenium%20Software/Offline%20Website/index.html");
	d.manage().window().maximize();
String str=	d.findElement(By.xpath("html/body/div[1]/div[2]/form/div[1]/input")).getAttribute("placeholder");
String str1= "Email";
Assert.assertEquals(str, str1);


WebElement btncolor= d.findElement(By.xpath("//button[@class='btn btn-primary btn-block btn-flat']"));
System.out.println("color of login button   "+btncolor.getCssValue("background-color"));
Actions act = new Actions(d);
act.moveToElement(btncolor).build().perform();
System.out.println("after mousover operation button color    "+btncolor.getCssValue("color"));


//public  void chek_Links() {
List<WebElement> links =  d.findElements(By.tagName("a"));
System.out.println(links.size());
for(int i=0;i<links.size();i++) {
System.out.println(links.get(i).getText());
}






}
}
