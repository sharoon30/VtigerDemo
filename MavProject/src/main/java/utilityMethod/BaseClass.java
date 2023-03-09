package utilityMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
public	WebDriver driver;
public	WebDriverWait explicitWait; 
	
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharoon\\eclipse-workspace\\Selenium18\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void loginToShopperShop() {
		driver.get("https://shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		explicitWait = new WebDriverWait(driver, 15);
		explicitWait.until(ExpectedConditions.titleContains("ShoppersStack"));
	}
	

}
