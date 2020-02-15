package JBK;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.*;

public class HomePage {
@Test
public void linkTest() throws Exception {
	int j=0;
	JxlReading.ExcelRead();
	int row=JxlReading.ExpStr.length;
	String [] LinkArr= new String[row+1];
	WebDriver d= new FirefoxDriver();
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	d.get("http://www.javabykiran.com/");
	for(int i=1;i<=17;i++) {
	WebElement link =d.findElement(By.xpath(".//*[@id='cssmenu']/ul/li["+i+"]/a"));
	String LinkName= link.getText();	
	LinkArr[j]=LinkName;
	j++;
	}
	Assert.assertEquals(LinkArr[0],JxlReading.ExpStr[0]);
	
	SoftAssert soft= new SoftAssert();
	for(int s=0;s<=17;s++) {
	soft.assertEquals(LinkArr[s],JxlReading.ExpStr[s]);
    }
	soft.assertAll();
	}}
