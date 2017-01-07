package OobjectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjectRepository {
	
	WebDriver driver;
	public HomePageObjectRepository(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='globalHeader']/div/a/img")
	WebElement logo;
	
	@FindBy(xpath = "//*[@id='quickSearch']/div[1]/div[2]/ul/li[1]/a")
	WebElement anyButton;
	
	@FindBy(xpath = "//*[@id='quickSearch']/div[1]/div[2]/ul/li[2]/a/span")
	WebElement studioButton;
	
	@FindBy(xpath = "//*[@id='quickSearch']/div[1]/div[2]/ul/li[3]/a")
	WebElement oneBedButton;
	
	@FindBy(xpath = "//*[@id='quickSearch']/div[1]/div[2]/ul/li[4]/a")
	WebElement twoBedButton;
	
	@FindBy(xpath = "//*[@id='minRent']")
	WebElement minRentBox;
	
	@FindBy(xpath = "//*[@id='maxRent']")
	WebElement maxRentBox;
	
	@FindBy(xpath = "//*[@id='quickSearch']/div[1]/div[2]/ul/li[5]/a/span")
	WebElement threeBedButton;
	
	@FindBy(xpath = "//*[@id='quickSearch']/div[1]/div[2]/ul/li[6]/a/span")
	WebElement fourBedButton;
	
	@FindBy(xpath = "//*[@id='headerAddListing']")
	WebElement customerPortalIcon;
	
	@FindBy(xpath = "//*[@id='headerAddEditListing']")
	WebElement addAListingIcon;
	
	@FindBy(xpath = "//*[@id='headerAdvertise']")
	WebElement advertiseIcon;
	
	@FindBy(xpath = "//*[@id='headerMobileApps']")
	WebElement mobileApps;
	
	@FindBy(xpath = "//*[@id='mainSearchWrap']")
	WebElement colorSection;
	
	@FindBy(xpath = "//*[@id='globalHeader']")
	WebElement headerSection;
	
	@FindBy(xpath = "//*[@id='headerSignIn']")
	WebElement signInLink;
	
	@FindBy(xpath = "//*[@id='headerMyFavorites']")
	WebElement myFavouritesLink;
	
	@FindBy(xpath = "//*[@id='headerMenuIcon']")
	WebElement iconMenu;
	
	@FindBy(xpath = "//*[@id='watchPricingTools']/div/div[2]")
	WebElement learnMore;
	
	@FindBy(xpath = "//*[@id='quickSearchLookup']")
	WebElement locationSearch;
	
	@FindBy(xpath = "//*[@id='quickSearch']/div[1]/button")
	WebElement bedsButton;
	
	@FindBy(xpath = "//*[@id='quickSearch']/a")
	WebElement goLink;
	
	@FindBy(xpath = "//*[@id='priceRangeContainer']/div[1]")
	WebElement priceRange;
	
	@FindBy(xpath = "//*[@id='companySpotlight']/div/div[1]/h2")
	WebElement keyText;
	
	@FindBy(xpath = "//*[@id='appStoreAction']")
	WebElement appStoreLink;
	
	@FindBy(xpath = "//*[@id='googlePlayAction']")
	WebElement googlePlayLink;
	
	@FindBy(xpath = "//*[@id='featuresSpotlight']")
	WebElement imgSection;
	
	@FindBy(xpath = "//*[@id='featuresSpotlight']/div")
	WebElement divText;
	
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
	
	@FindBy(xpath = "//*[@id='mobileSpotlight']/div/div[2]/div")
	WebElement spotLightImage;
	
	@FindBy(xpath = "//*[@id='companySpotlight']/div/div[1]/p[1]/a")
	WebElement statesLink;
	
	@FindBy(xpath = "//*[@id='companySpotlight']/div/div[1]/p[1]/strong")
	WebElement strongText;
	
	@FindBy(xpath = "//*[@id='mainSearchWrap']/h1/span[1]")
	WebElement bigFontText;
	
	public WebElement getAnyButton(){
		return anyButton;
	}
	public WebElement getMinRentBox(){
		return minRentBox;
	}
	public WebElement getMaxRentBox(){
		return maxRentBox;
	}
	public WebElement getStudioButton(){
		return studioButton;
	}
	public WebElement getOneBedButton(){
		return oneBedButton;
	}
	public WebElement getTwoBedButton(){
		return twoBedButton;
	}
	public WebElement getThreeBedButton(){
		return threeBedButton;
	}
	public WebElement getFourBedButton(){
		return fourBedButton;
	}
	public WebElement getCustomerPortalIcon(){
		return customerPortalIcon;
	}
	public WebElement getAddAListingIcon(){
		return addAListingIcon;
	}
	public WebElement getAdvertiseIcon(){
		return advertiseIcon;
	}
	public WebElement getMobileApps(){
		return mobileApps;
	}
	public WebElement getStrongText(){
		return strongText;
	}
	public WebElement getBigFontText(){
		return bigFontText;
	}
	public WebElement getIconPinterestCircle(){
		return iconPinterestCircle;
	}
	public WebElement getStatesLink(){
		return statesLink;
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
	public WebElement getDivText(){
		return divText;
	}
	public WebElement getSpotLightImage(){
		return spotLightImage;
	}
	public WebElement getAppStoreLink(){
		return appStoreLink;
	}
	public WebElement getImgSection(){
		return imgSection;
	}
	public WebElement getGooglePlayLink(){
		return googlePlayLink;
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
	public WebElement getLearnMore(){
		return learnMore;
	}
	public WebElement getLocationSearch(){
		return locationSearch;
	}
	public WebElement getBedsButton(){
		return bedsButton;
	}
	public WebElement getGoLink(){
		return goLink;
	}
	public WebElement getPriceRange(){
		return priceRange;
	}
	public WebElement getKeyText(){
		return keyText;
	}
	public WebElement getColorSection(){
		return colorSection;
	}
	public WebElement getHeaderSection(){
		return headerSection;
	}
}
