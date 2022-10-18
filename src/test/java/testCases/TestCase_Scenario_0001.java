package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.DealsPageObjects;
import pageObjects.HomePageObjects;
import testBase.TestBase;

public class TestCase_Scenario_0001 extends TestBase {

	HomePageObjects hp = new HomePageObjects();
	DealsPageObjects dp= new DealsPageObjects(); 
	
	@Test
	public void test_CIMBDeals_scn0001() {
		
		/*  Environment: https://www.cimb.com.my/en/personal/home.html
			
			Scenario 1: 
			Given I’m on CIMB page
			When I select CIMB Deals
			And I click on View All for Travel & Lifestyle
			And I would like to explore more for OctoTravel Visa Flights
			Then I will be able to see its details and other similar deals beneath it
		 */
		
		
		logger.info("Started execution of Test case - test_CIMBDeals_scn0001");
		hp.close_popUp_alert();	
		hp.accept_cookie();
		hp.click_on_menu_icon();
		hp.click_on_CIMBDeals();
		
		dp.scroll_to_travelAndLifeStyle();
		dp.click_on_viewAll_TravelAndLifeStyle();
		dp.click_on_octoTravelFlight();
		
		boolean result = dp.verify_smilar_deals_present();
		
		Assert.assertEquals(result, true,"test_CIMBDeals_scn0001 failed, Similar deal details not found");
		logger.info("Completed execution of Test case - test_CIMBDeals_scn0001");
	
	}
}
