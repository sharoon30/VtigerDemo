package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuzukiTest {
	@Parameters("browerName")
	@Test
	public void openWebsite(@Optional("firefox")String value) throws Exception{
		WebDriver driver = null;
		if(value.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(value .equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://www.marutisuzuki.com/");
		Thread.sleep(3000);
		driver.close();
	}
}
