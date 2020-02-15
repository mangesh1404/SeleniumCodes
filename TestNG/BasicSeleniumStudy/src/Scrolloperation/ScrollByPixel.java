package Scrolloperation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScrollByPixel {
public static void main(String[] args)throws Exception {
	WebDriver d = new FirefoxDriver();
	d.get("http://demo.guru99.com/test/guru99home/");
	WebElement e= d.findElement(By.linkText("Linux"));
	JavascriptExecutor js= (JavascriptExecutor)d;
	//  below line scroll down by 1000 pixels
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-1000)");
	//below line  scroll down to view "linux" linktext
	//js.executeScript("arguments[0].scrollIntoView();",e);
	 //This will scroll the web page till end.		
   // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}
}
