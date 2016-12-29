package myFavouritesTesting;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ApartmentFinder.HomePage.BasePage;
import ApartmentFinder.HomePage.HomePageObjectRepository;

public class MyFavWithoutLoginTest{
	static WebDriver driver;
	//@Test
	public void MyFavTest() throws IOException{
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		
	}
}
