package ApartmentFinder.HomePage;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageObjectsTest1{
	
	static WebDriver driver;
	
	//testing the title of HomePage
	//@Test	
	public void loginTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		Properties prop = BP.getAccessProp();
		//Assertion
		//testing current page title with our properties file title
		Assert.assertEquals(prop.getProperty("homepagetitle"), driver.getTitle());
	}
	
	//testing for the default value in Location Search box
	//@Test	
	public void searchBoxValueTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		Properties prop = BP.getAccessProp();
		String location = HOR.getLocationSearch().getAttribute("value");
		//assertion
		//testing current page Location Search box value with our properties file location value
		Assert.assertEquals(true, location.contains(prop.getProperty("location")));
	}
	
	//testing for the background color of both header, section elements
	//@Test success
	public void bannerBackgroundTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		System.out.println();
		Properties prop = BP.getAccessProp();
		String headerBackgroundColor = HOR.getHeaderSection().getCssValue("background-color");
		String sectionBackgroundColor = HOR.getColorSection().getCssValue("background-color");
		//Assertions
		//testing page background color value with our properties file color values
		Assert.assertEquals(prop.getProperty("headersectionbackgroundcolor"), headerBackgroundColor);
		Assert.assertEquals(prop.getProperty("sectionbackgroundcolor"), sectionBackgroundColor);
		
	}
}

