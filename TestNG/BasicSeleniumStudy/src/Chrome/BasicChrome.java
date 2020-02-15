package Chrome;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class BasicChrome {
			public static void main(String[] args) throws InterruptedException {
			
//System.setProperty(key, value)
		System.setProperty("WebDriver.Chrome.driver", "C:/chromedriver.exe");

			WebDriver wd=new ChromeDriver();
			wd.get("file:///D:/Java%20study/Selenium%20Software/Offline%20Website/index.html");

			wd.manage().window().maximize();
			
			WebElement weUser = wd.findElement(By.id("email"));
			weUser.clear();
			weUser.sendKeys("kiran@gmail.com");

			WebElement weError1 = wd.findElement(By.id("email_error"));
			String labelError1 = weError1.getText();
			System.out.println(labelError1);

			WebElement wePswd = wd.findElement(By.id("password"));
			//wePswd.clear();
			wePswd.sendKeys("123456");

     		WebElement weError2 = wd.findElement(By.id("password_error"));
			String labelError2 = weError2.getText();
			System.out.println(labelError2);

			WebElement weButton = wd.findElement(By.xpath(".//*[@id='form']/div[3]/div/button"));
			weButton.click();
			
			WebElement weUser1 = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
			weUser1.click();
			
			WebElement weAddUser = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button"));
			weAddUser.click();
			Thread.sleep(500);
			
			WebElement weUname = wd.findElement(By.xpath(".//*[@id='username']"));
			weUname.sendKeys("mangesh");
			
			WebElement weMob = wd.findElement(By.xpath(".//*[@id='mobile']"));
			weMob.sendKeys("111112");
			
			WebElement weEmail = wd.findElement(By.xpath(".//*[@id='email']"));
			weEmail.sendKeys("mangesh@gmail.com");
			
			WebElement weGender = wd.findElement(By.id("Male"));
			weGender.click();
			
			Select s=new Select(wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")));
			s.selectByVisibleText("Punjab");
			
			WebElement wePwd = wd.findElement(By.xpath(".//*[@id='password']"));
			wePwd.sendKeys("123789");
			
			WebElement weSubmit = wd.findElement(By.xpath(".//*[@id='submit']"));
			weSubmit.click();
			Alert al = wd.switchTo().alert();
			al.accept(); 

			Thread.sleep(3000);
			
			WebElement weuser = wd.findElement(By.xpath("html/body/div[1]/aside[1]/section/ul/li[3]/a/span"));
			weuser.click(); 

//	*//********************  Logic for table printing *********************//*
			WebElement table = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
			for(int j =2; j<=5; j++) {
				for(int i=1;i<=5;i++){
					WebElement tblele = wd.findElement(By.xpath("html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["+j+"]/td["+i+"]"));
					System.out.print(" " + tblele.getText());
				}
				System.out.println();
			}
	//*//********************  Logic for table printing *********************//*
		}
	}


