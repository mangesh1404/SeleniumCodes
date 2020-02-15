package com.jbk;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
public class A {
	public static void main(String[] args) {
		
	 	WebDriver wd = new FirefoxDriver();
		wd.manage().deleteAllCookies();
	 wd.get("file:///D:/Java%20study/Selenium%20Software/Offline%20Website/index.html");
	 String url = wd.getCurrentUrl();
	  System.out.println(url);
	  WebElement uname=wd.findElement(By.xpath("//input[@id='email']"));
	  Actions act= new Actions(wd);
	  act.moveToElement(uname).click().build().perform();
	  uname.sendKeys("kiran@gmail.com");
	  wd.findElement(By.id("password")).sendKeys("123456");
	  wd.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
	  WebElement weuser = wd.findElement(By.xpath("//span[text()='Users']"));
	  weuser.click();
	  wd.findElement(By.xpath("//button[text()='Add User']")).click();
	  WebElement wename = wd.findElement(By.id("username"));
			     wename.sendKeys("mangesh");
			     WebElement wemob = wd.findElement(By.id("mobile"));
			     wemob.sendKeys("94058");
			     wd.findElement(By.id("email")).sendKeys("mangesh@gmail.com");
			     WebElement male = wd.findElement(By.id("Male"));
			     male.click();
			    WebElement ele = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select"));
			    Select sel = new Select(ele);
			  List <WebElement> l=sel.getOptions();
			    for(WebElement name : l) {
			    	String value=name.getText();
			    	if(value.equals("Telangana")) {
			    		System.out.println("Telangana is present");
			    	}else System.out.println("Telangana is not present");
			    }
			    sel.selectByVisibleText("Maharashtra");
			    wd.findElement(By.id("password")).sendKeys("123456");
			    wd.findElement(By.id("submit")).submit();
			    Alert al = wd.switchTo().alert();
			    String s1 = al.getText();
			    System.out.println(s1);
			    al.accept();
	          

	  /*wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span")).click();
	  //WebElement table = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
	  for(int i=1;i<=7;i++) {
		  System.out.print(wd.findElement(By.xpath(".//*[@id='tr_4']/td[i]")));
	  }*/
	  
	  
	  
	  
	/*  for(int j=2;j<=5;j++) {
		  for(int i=1;i<=7;i++) {
			  WebElement t = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td["+i+"]"));
			  System.out.print("  "+t.getText());
		  }
		  System.out.println();
	  }*/
			    /*Select s= new Select(wemob);
			     //s.selectByValue(value);
			  List <WebElement> l=s.getOptions();
			    for(WebElement name : l) {
			    	String value=name.getText();
			    	if(value.equals("Telangana")) {
			    		System.out.println("Telangana is present");}*/
			    
			    /*Alert al =wd.switchTo().alert();
				al.accept();
				wd.getWindowHandles();
				wd.getWindowHandle();*/
				//DesiredCapabilities cap = new DesiredCapabilities();
			    	
			    }}
	 
