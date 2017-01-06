package ApartmentFinder.HomePage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class HomepageObjectsTest1{
	
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
	
	//testing the title of HomePage
	@Test(groups = {"highProirity"})
	public void HPTitleTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		Properties prop = BP.getAccessProp();
		//Assertion
		//testing current page title with our properties file title
		Assert.assertEquals(prop.getProperty("homepagetitle"), driver.getTitle());
	}
	
	//testing for the default value in Location Search box
	@Test(groups = {"highProirity"})	
	public void HPSearchBoxValueTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		//Properties prop = BP.getAccessProp();
		String location = HOR.getLocationSearch().getAttribute("value");
		//assertion
		Assert.assertEquals(false,location.isEmpty());
		//testing current page Location Search box value with our properties file location value
		//Assert.assertEquals(true, location.contains(prop.getProperty("location")));
	}
	
	//testing for the background color of both header, section elements
	@Test 
	public void HPBannerBackgroundTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		Properties prop = BP.getAccessProp();
		String headerBackgroundColor = HOR.getHeaderSection().getCssValue("background-color");
		String sectionBackgroundColor = HOR.getColorSection().getCssValue("background-color");
		//Assertions
		//testing page background color value with our properties file color values
		Assert.assertEquals(prop.getProperty("headersectionbackgroundcolor"), headerBackgroundColor);
		Assert.assertEquals(prop.getProperty("sectionbackgroundcolor"), sectionBackgroundColor);
		
	}
	
	//testing for the objects in the homepage
	@Test(groups = {"highProirity"})
	public void homePageElementsTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		Assert.assertEquals(true, HOR.getGoLink().isDisplayed());
		Assert.assertEquals(true, HOR.getBedsButton().isDisplayed());
		Assert.assertEquals(true, HOR.getLearnMore().isDisplayed());
		Assert.assertEquals(true, HOR.getLocationSearch().isDisplayed());
		Assert.assertEquals(true, HOR.getLogo().isDisplayed());
		Assert.assertEquals(true, HOR.getMyFavouritesLink().isDisplayed());
		Assert.assertEquals(true, HOR.getSignInLink().isDisplayed());
		Assert.assertEquals(true, HOR.getKeyText().isDisplayed());
		Assert.assertEquals(true, HOR.getPriceRange().isDisplayed());
		Assert.assertEquals(true, HOR.getAppStoreLink().isDisplayed());
		Assert.assertEquals(true, HOR.getGooglePlayLink().isDisplayed());
		Assert.assertEquals(true, HOR.getIconBlogCircle().isDisplayed());
		Assert.assertEquals(true, HOR.getIconFacebookCircle().isDisplayed());
		Assert.assertEquals(true, HOR.getIconPinterestCircle().isDisplayed());
		Assert.assertEquals(true, HOR.getIconTwitterCircle().isDisplayed());
		Assert.assertEquals(true, HOR.getIconYoutubeCircle().isDisplayed());
		Assert.assertEquals(true, HOR.getSpotLightImage().isDisplayed());
		Assert.assertEquals(true, HOR.getDivText().isDisplayed());
		Assert.assertEquals(true, HOR.getStatesLink().isDisplayed());
	}
	
	//testing the number of links in homepage
	@Test(groups = {"highProirity"})
	public void HPLinkCountTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		int linkCount = BP.getLinkCount(driver);
		Properties prop = BP.getAccessProp();
		Assert.assertEquals(Integer.parseInt(prop.getProperty("homePageLinkCount")), linkCount);
	}
	
	//testing the font size and bold of text
	@Test 
	public void HPBoldFontSizeTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		Properties prop = BP.getAccessProp();
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		Assert.assertEquals(prop.getProperty("StongFont"), HOR.getStrongText().getCssValue("font-weight"));
		Assert.assertEquals(prop.getProperty("bigFont"), HOR.getBigFontText().getCssValue("font-size"));
		Assert.assertEquals(prop.getProperty("semiBoldFont"), HOR.getBigFontText().getCssValue("font-family"));
		
	}
}

