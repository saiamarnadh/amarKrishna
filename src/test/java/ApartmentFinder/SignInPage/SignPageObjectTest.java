package ApartmentFinder.SignInPage;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ApartmentFinder.HomePage.BasePage;
import OobjectRepository.SignInPageObjectRepository;
import junit.framework.Assert;

public class SignPageObjectTest {
	
	WebDriver driver;
	
	//@Test
	public void titleTest() throws IOException{
		SignInPage SP = new SignInPage();
		BasePage BP = new BasePage();
		driver = SP.getSigninPage(driver);
		Properties prop = BP.getAccessProp();
		Assert.assertEquals(prop.getProperty("signInPageTitle"), driver.getTitle());
	}
	
	@Test
	public void objectsTest() throws IOException, InterruptedException{
		SignInPage SP = new SignInPage();
		driver = SP.getSigninPage(driver);
		SignInPageObjectRepository SOP = new SignInPageObjectRepository(driver);
		Thread.sleep(2000L);
		Assert.assertEquals(true, SOP.getForgotPasswordLink().isDisplayed());
		Assert.assertEquals(true, SOP.getCrossButton().isDisplayed());
		Assert.assertEquals(true, SOP.getKeyText().isDisplayed());
		Assert.assertEquals(true, SOP.getLoginWithFacebookButton().isDisplayed());
		Assert.assertEquals(true, SOP.getLoginWithGoogleButton().isDisplayed());
		Assert.assertEquals(true, SOP.getMailInputFeild().isDisplayed());
		Assert.assertEquals(true, SOP.getPasswordInputFeild().isDisplayed());
		Assert.assertEquals(true, SOP.getMainText().isDisplayed());
		Assert.assertEquals(true, SOP.getOrText().isDisplayed());
		Assert.assertEquals(true, SOP.getSignUpLink().isDisplayed());
		Assert.assertEquals(true, SOP.getSignInButton().isDisplayed());
	}
}
