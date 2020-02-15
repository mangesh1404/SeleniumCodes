package IE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BasicLogin {
	 public static void main(String [] args) throws Exception{
         //System.setProperty("webdriver.ie.driver",path of executable file "IEDriverServer.exe")
         System.setProperty("webdriver.ie.driver", "D:/selelib/IEDriverServer.exe");
         //Initialize InternetExplorerDriver Instance.
         WebDriver driver = new InternetExplorerDriver();
         Thread.sleep(10000);
         driver.get("https://www.google.com/");
         System.out.println("Selenium Webdriver Script in Internet Explorer browser | Software Testing Material");
         driver.close();
  }
}
