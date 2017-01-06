package ApartmentFinder.MyFavouritesPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import ApartmentFinder.HomePage.BasePage;
import ApartmentFinder.HomePage.HomePageObjectRepository;

public class MyFavouritePage{
	WebDriver driver;
	
	public WebDriver MyFavTest(WebDriver driver) throws IOException{
		this.driver = driver;
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		HOR.getMyFavouritesLink().click();
		return driver;
	}

}
