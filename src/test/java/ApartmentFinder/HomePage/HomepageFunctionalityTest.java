package ApartmentFinder.HomePage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import OobjectRepository.HomePageObjectRepository;
import junit.framework.Assert;

public class HomepageFunctionalityTest {
	WebDriver driver;
	public void tearDown() {
	    if (this.driver != null) {
	        this.driver.close();
	    }
	}
	@AfterMethod(alwaysRun = true)
	public void closingBrowser(Method method){
		tearDown();
	}
	@Test
	public void iconTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		HOR.getIconMenu().click();
		Assert.assertEquals(true, HOR.getAdvertiseIcon().isDisplayed());
		Assert.assertEquals(true, HOR.getCustomerPortalIcon().isDisplayed());
		Assert.assertEquals(true, HOR.getAddAListingIcon().isDisplayed());
		Assert.assertEquals(true, HOR.getMobileApps().isDisplayed());
	}
	
	@Test
	public void bedsTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		HOR.getBedsButton().click();
		Assert.assertEquals(true, HOR.getAnyButton().isDisplayed());
		Assert.assertEquals(true, HOR.getStudioButton().isDisplayed());
		Assert.assertEquals(true, HOR.getOneBedButton().isDisplayed());
		Assert.assertEquals(true, HOR.getTwoBedButton().isDisplayed());
		Assert.assertEquals(true, HOR.getThreeBedButton().isDisplayed());
		Assert.assertEquals(true, HOR.getFourBedButton().isDisplayed());
	}
	@Test
	public void priceBoxTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		HOR.getPriceRange().click();
		Assert.assertEquals(true, HOR.getMaxRentBox().isDisplayed());
		Assert.assertEquals(true, HOR.getMinRentBox().isDisplayed());
		
	}
}
