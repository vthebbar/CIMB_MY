package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testBase.DriverFactory;
import testBase.TestBase;

public class HomePageObjects extends TestBase {
	
	
	//required page elements
	By popup_alertBox = By.xpath("//*[local-name()='svg' and @width='18' and @height='18']");
	By message_cookie = By.xpath("//div[text()='Accept and Close']");
	By menu_entry = By.xpath("//*[local-name()='svg' and @class='stroke-current']");
	By link_CIMBDeals = By.linkText("CIMB Deals");
	
	
	//methods
	
	public void close_popUp_alert() {
		WebElement element = DriverFactory.get_instance().get_driver().findElement(popup_alertBox);
		do_wait(popup_alertBox);
		if(do_isElementDisplayed(element, "HomePagePopUpAlert")) {
			do_mouseClick(element,"HomePagePopUpAlert");

			//JavascriptExecutor executor = (JavascriptExecutor)DriverFactory.get_instance().get_driver();
			//executor.executeScript("arguments[0].click();", element);
			
			
		}
	}
	
	public void accept_cookie() {
		WebElement cookieBtn = DriverFactory.get_instance().get_driver().findElement(message_cookie);
		if(do_isElementDisplayed(cookieBtn, "CookieAcceptanceMessage")) {
			do_mouseClick(cookieBtn,"CookieAcceptanceMessage");

		}
	}
	
	public void click_on_menu_icon() {
		WebElement element = DriverFactory.get_instance().get_driver().findElement(menu_entry);
		do_mouseClick(element,"MenuIcon");

	}
	
	public void click_on_CIMBDeals() {
		WebElement element = DriverFactory.get_instance().get_driver().findElement(link_CIMBDeals);
		do_mouseClick(element,"CIMBDealsMenu");
	}
	
	
}
