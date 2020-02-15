package ListenerProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TrackChangeInApplication implements WebDriverEventListener {

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("afterChangeValueOf ---");
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("afterClickOn --");		
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("afterFindBy --");		
	}

	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("afterNavigateBack --");		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("afterNavigateForward --");	}

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("afterNavigateTo --");		
	}

	@Override
	public void afterScript(String url, WebDriver driver) {
		System.out.println("afterScript --");		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("beforeChangeValueOf --");		
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("beforeClickOn --");		
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("beforeFindBy ---");		
	}

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("beforeNavigateBack ----");		
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("beforeNavigateForward ---");		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("beforeNavigateTo ---");		
	}

	@Override
	public void beforeScript(String arg0, WebDriver driver) {
		System.out.println();		
	}

	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println();		
	}

}
