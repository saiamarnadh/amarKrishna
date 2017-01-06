package ApartmentFinder.MyFavouritesPage;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import ApartmentFinder.HomePage.BasePage;
import ApartmentFinder.HomePage.HomePageObjectRepository;
import ApartmentFinder.HomePage.MyFavouritesPageObjectRepository;

public class MyFavPageTestWithoutLogin {
	
	WebDriver driver;
	@AfterMethod
	public void tearDown() {
	    if (this.driver != null) {
	        this.driver.close();
	    }
	}
	@AfterMethod(alwaysRun = true)
	public void closingBrowser(Method method){
		tearDown();
	}
	//test for zero length of title
	@Test(groups = {"highProirity"})
	public void FPTitleTest() throws IOException{
		MyFavouritePage FP = new MyFavouritePage();
		driver = FP.MyFavTest(driver);
		Assert.assertEquals(0, driver.getTitle().length());
	}
	
	//testing favourite count page
	@Test(groups = {"highProirity"})
	public void FPCountWithoutLogin() throws IOException{
		MyFavouritePage FP = new MyFavouritePage();
		driver = FP.MyFavTest(driver);
		MyFavouritesPageObjectRepository FOR = new MyFavouritesPageObjectRepository(driver);
		Assert.assertEquals("0", FOR.getFavCount().getText());
	}
	
	//testing the objects in favourites page
	@Test(groups = {"highProirity"}) 
	public void FPObjectsTest() throws IOException{
		MyFavouritePage FP = new MyFavouritePage();
		driver = FP.MyFavTest(driver);
		MyFavouritesPageObjectRepository FOR = new MyFavouritesPageObjectRepository(driver);
		Assert.assertEquals(true, FOR.getFavCount().isDisplayed());
		Assert.assertEquals(true, FOR.getKeyText().isDisplayed());
		Assert.assertEquals(true, FOR.getMainText().isDisplayed());
		Assert.assertEquals(true, FOR.getHeaderSection().isDisplayed());
		Assert.assertEquals(true, FOR.getIconBlogCircle().isDisplayed());
		Assert.assertEquals(true, FOR.getIconFacebookCircle().isDisplayed());
		Assert.assertEquals(true, FOR.getIconMenu().isDisplayed());
		Assert.assertEquals(true, FOR.getIconPinterestCircle().isDisplayed());
		Assert.assertEquals(true, FOR.getIconYoutubeCircle().isDisplayed());
		Assert.assertEquals(true, FOR.getSignInLink().isDisplayed());
		Assert.assertEquals(true, FOR.getIconTwitterCircle().isDisplayed());
		Assert.assertEquals(true, FOR.getMyFavouritesLink().isDisplayed());
		Assert.assertEquals(true, FOR.getLogo().isDisplayed());
		
	}
	
	//checking the location from homepage to favourite page
	@Test(groups = {"highProirity"})
	public void FPLocationLookUpTest() throws IOException{	
		BasePage BP = new BasePage();
		this.driver = BP.basePage(driver);
		HomePageObjectRepository HOR = new HomePageObjectRepository(driver);
		String location = HOR.getLocationSearch().getAttribute("value");
		HOR.getMyFavouritesLink().click();
		String LocationLookUp = driver.findElement(By.xpath("//input[@id='headerSearchBarLookup']")).getAttribute("value");
		Assert.assertEquals(location, LocationLookUp);
	}
	
	//testing the number of links in favourite page
	@Test 
	public void FPLinkCountTest() throws IOException{
		MyFavouritePage FP = new MyFavouritePage();
		BasePage BP = new BasePage();
		this.driver = FP.MyFavTest(driver);
		int linkCount = BP.getLinkCount(driver);
		Properties prop = BP.getAccessProp();
		Assert.assertEquals(Integer.parseInt(prop.getProperty("favPageLinkCount")), linkCount);
	}
	

}
