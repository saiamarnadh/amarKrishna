package ApartmentFinder.SignInPage;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import ApartmentFinder.HomePage.BasePage;
import OobjectRepository.HomePageObjectRepository;

public class SignInPage {
	WebDriver driver;
	
	public WebDriver getSigninPage(WebDriver driver) throws IOException{
		this.driver = driver;
		BasePage BP = new BasePage();
		driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		HOR.getSignInLink().click();
		return driver;
	}
}
