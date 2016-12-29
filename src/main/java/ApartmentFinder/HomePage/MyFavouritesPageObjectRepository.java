package ApartmentFinder.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyFavouritesPageObjectRepository {
	@FindBy(xpath = "//*[@id='FavoriteListingsSection']/section[2]/h4")
	WebElement keyText;
	
	@FindBy(xpath = "//*[@id='FavoriteListingsSection']/section[1]/div[1]/h4")
	WebElement mainText;
	
	public WebElement getKeyText(){
		return keyText;
	}
	public WebElement getMainText(){
		return mainText;
	}
	
}
