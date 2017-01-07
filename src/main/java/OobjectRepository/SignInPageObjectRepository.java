package OobjectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPageObjectRepository {
	WebDriver driver;
	
	public SignInPageObjectRepository(WebDriver driver){
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='loginModalHeader']")
	WebElement mainText;
	
	@FindBy(xpath = "//*[@id='loginEmail']")
	WebElement mailInputFeild;
	
	@FindBy(xpath = "//*[@id='loginPassword']")
	WebElement passwordInputFeild;
	
	@FindBy(xpath = "//*[@id='loginModal']/div/div[1]/button")
	WebElement crossButton;
	
	@FindBy(xpath = "//*[@id='signIn']/span[2]")
	WebElement signInButton;
	
	@FindBy(xpath = "//*[@id='loginForgotPassword']")
	WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//*[@id='signUp']")
	WebElement signUpLink;
	
	@FindBy(xpath = "//*[@id='facebookLogin']/span")
	WebElement loginWithFacebookButton;
	
	@FindBy(xpath = "//*[@id='googleLogin']/span")
	WebElement loginWithGoogleButton;
	
	@FindBy(xpath = "//*[@id='loginModal']/div/div[2]/div/div[1]")
	WebElement keyText;
	
	@FindBy(xpath = "//*[@id='loginModal']/div/div[2]/div/div[2]/span[1]")
	WebElement orText;
	
	public WebElement getOrText(){
		return orText;
	}
	public WebElement getKeyText(){
		return keyText;
	}
	public WebElement getLoginWithGoogleButton(){
		return loginWithGoogleButton;
	}
	public WebElement getLoginWithFacebookButton(){
		return loginWithFacebookButton;
	}
	public WebElement getSignUpLink(){
		return signUpLink;
	}
	public WebElement getForgotPasswordLink(){
		return forgotPasswordLink;
	}
	public WebElement getSignInButton(){
		return signInButton;
	}
	public WebElement getCrossButton(){
		return crossButton;
	}
	public WebElement getPasswordInputFeild(){
		return passwordInputFeild;
	}
	public WebElement getMailInputFeild(){
		return mailInputFeild;
	}
	public WebElement getMainText(){
		return mainText;
	}
	
}
