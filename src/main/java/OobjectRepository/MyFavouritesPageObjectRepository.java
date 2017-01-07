package OobjectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyFavouritesPageObjectRepository {
	
	WebDriver driver;
	
	public MyFavouritesPageObjectRepository(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='FavoriteListingsSection']/section[2]/h4")
	WebElement keyText;
	
	@FindBy(xpath = "//*[@id='globalHeader']/div/a/img")
	WebElement logo;
	
	@FindBy(xpath = "//*[@id='globalHeader']")
	WebElement headerSection;
	
	@FindBy(xpath = "//*[@id='headerSignIn']")
	WebElement signInLink;
	
	@FindBy(xpath = "//*[@id='headerMyFavorites']")
	WebElement myFavouritesLink;
	
	@FindBy(xpath = "//*[@id='headerMenuIcon']")
	WebElement iconMenu;
	
	@FindBy(xpath = "//*[@id='globalFooter']/div[1]/div[1]/div/div/div[2]/a[1]/i")
	WebElement iconFacebookCircle;
	
	@FindBy(xpath = "//*[@id='globalFooter']/div[1]/div[1]/div/div/div[2]/a[1]/i")
	WebElement iconTwitterCircle;
	
	@FindBy(xpath = "//*[@id='globalFooter']/div[1]/div[1]/div/div/div[2]/a[1]/i")
	WebElement iconBlogCircle;
	
	@FindBy(xpath = "//*[@id='globalFooter']/div[1]/div[1]/div/div/div[2]/a[1]/i")
	WebElement iconYoutubeCircle;
	
	@FindBy(xpath = "//*[@id='globalFooter']/div[1]/div[1]/div/div/div[2]/a[1]/i")
	WebElement iconPinterestCircle;
	
	@FindBy(xpath = "//*[@id='FavoriteListingsSection']/section[1]/div[1]/h4")
	WebElement mainText;
	
	@FindBy(xpath = "//*[@id='FavoriteListingsSection']/section[1]/div[1]/span")
	WebElement favCount;
	
	@FindBy(xpath = "//input[@id='headerSearchBarLookup']")
	WebElement locationLookUp;
	
	public WebElement getLocationLookUp(){
		return locationLookUp;
	}
	public WebElement getKeyText(){
		return keyText;
	}
	public WebElement getFavCount(){
		return favCount;
	}
	public WebElement getMainText(){
		return mainText;
	}
	public WebElement getIconPinterestCircle(){
		return iconPinterestCircle;
	}
	public WebElement getIconYoutubeCircle(){
		return iconYoutubeCircle;
	}
	public WebElement getIconBlogCircle(){
		return iconBlogCircle;
	}
	public WebElement getIconTwitterCircle(){
		return iconTwitterCircle;
	}
	public WebElement getIconFacebookCircle(){
		return iconFacebookCircle;
	}
	public WebElement getLogo(){
		return logo;
	}
	public WebElement getSignInLink(){
		return signInLink;
	}
	public WebElement getMyFavouritesLink(){
		return myFavouritesLink;
	}
	public WebElement getIconMenu(){
		return iconMenu;
	}

	public WebElement getHeaderSection(){
		return headerSection;
	}
}
