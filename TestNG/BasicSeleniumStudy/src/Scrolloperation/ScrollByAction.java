package Scrolloperation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAction {
public static void main(String[] args) throws Exception{
	System.getProperty("webdriver.chrome.driver","C://chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.javabykiran.com");
	Thread.sleep(3000);
	Actions a = new Actions(d);
	a.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(3000);
	a.sendKeys(Keys.PAGE_UP).build().perform();
}
}
