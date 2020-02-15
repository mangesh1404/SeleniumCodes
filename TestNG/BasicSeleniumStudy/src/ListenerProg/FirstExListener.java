package ListenerProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class FirstExListener {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	
	EventFiringWebDriver eventdriver = new EventFiringWebDriver(driver);
	
	TrackChangeInApplication trackchange = new TrackChangeInApplication();
	
	eventdriver.register(trackchange);
	
	eventdriver.get("file:///D:/Java%20study/Selenium%20Software/Offline%20Website/index.html");
	
	eventdriver.manage().window().maximize();
	
	WebElement userele = eventdriver.findElement(By.xpath(".//*[@id='email']"));
	userele.clear();
	userele.sendKeys("kiran@gmail.com");
	
	WebElement passele = eventdriver.findElement(By.xpath(".//*[@id='password']"));
	passele.clear();
	passele.sendKeys("123456");
	
	
	WebElement signinbutton = eventdriver.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
			signinbutton.click();
			
			
			WebElement logoutbutton  = eventdriver.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[5]/a/span"));
			logoutbutton.click();
}
}
