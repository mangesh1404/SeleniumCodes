package Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeEx {
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://retail.onlinesbi.com/retail/login.htm");
	Thread.sleep(5000);
	d.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("kiran@gmail.com");
	
	
	
	
}
}
