package com.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {
public static void main(String[] args) {
	WebDriver d = new FirefoxDriver();
	d.get("http://javabykiran.com/javabykiranfiles/");
	Actions builder = new Actions(d);
	WebElement user = d.findElement(By.xpath(".//*[@id='login_form_user']"));
	Action serOfAct = builder.moveToElement(user).click().keyDown(user, Keys.SHIFT)
			.sendKeys(user, "javabykiran").doubleClick(user).contextClick().build();
	serOfAct.perform();
}
} 
