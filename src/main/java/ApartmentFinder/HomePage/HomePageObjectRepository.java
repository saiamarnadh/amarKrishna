package ApartmentFinder.HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjectRepository {
	
	static WebDriver driver;
	public HomePageObjectRepository(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='globalHeader']/div/a/img")
	WebElement logo;
	
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
