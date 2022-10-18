package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testBase.DriverFactory;
import testBase.TestBase;

public class DealsPageObjects extends TestBase {
	
	// Required web elements
	By txt_travelAndLifeStyleSection = By.xpath("//span[text()='travel & lifestyle']");
	By link_travelAndLifeStyle_ViewAll = By.xpath("//span[text()='travel & lifestyle']//parent::span//parent::div//following-sibling::div//a[text()='View All']");
	By link_octo_travel_flight = By.xpath("//p[text()='travel & lifestyle • OctoTravel']//following-sibling::p[contains(text(),'flight bookings')]");
	By txt_similar_deals = By.xpath("//p[text()='Similar Deals']");
	By txt_travel_and_lifestyle= By.xpath("//p[contains(text(),'travel & lifestyle')]");
	
	
	// methods
	
	public void scroll_to_travelAndLifeStyle() {
		
		WebElement element = DriverFactory.get_instance().get_driver().findElement(txt_travelAndLifeStyleSection);
		do_moveToElement(element, "TRAVEL & LIFESTYLE");
	}
	
	public void click_on_viewAll_TravelAndLifeStyle() {
		WebElement element = DriverFactory.get_instance().get_driver().findElement(link_travelAndLifeStyle_ViewAll);
		do_mouseClick(element,"ViewAllTravelAndLifeStyle");
	}
	
	public void click_on_octoTravelFlight() {
		WebElement element = DriverFactory.get_instance().get_driver().findElement(link_octo_travel_flight);
		do_moveToElement(element, "OCTOTravelFlight");
		do_mouseClick(element,"OCTOTravelFlight");

	}
	
	public boolean verify_smilar_deals_present() {
		WebElement element1 = DriverFactory.get_instance().get_driver().findElement(txt_similar_deals);
		WebElement element2 = DriverFactory.get_instance().get_driver().findElement(txt_travel_and_lifestyle);
		boolean flag1 = do_isElementDisplayed(element1, "Similar Deals Section");
		boolean flag2 =do_isElementDisplayed(element2, "travel & lifestyle text");
		
		if(flag1 && flag2) {
			return true;
		}
		else {
			return false;
		}
	}
}
