package ApartmentFinder.HomePage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	WebDriver driver;
	public Properties getAccessProp() throws IOException{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\saiam\\workspace\\ApartmentFinder\\parameters.properties");
		prop.load(fis);
		return prop;
	}
	public WebDriver basePage(WebDriver driver) throws IOException{
		this.driver = driver;
		Properties prop = getAccessProp();
		if(prop.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiam\\Downloads\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public int getLinkCount(WebDriver driver) throws IOException{
		this.driver = driver;
		int count = driver.findElements(By.tagName("a")).size();
		return count;
	}
}
