package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TVSTest {
	
	@Test
	public void openWebsite() throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tvsmotor.com/tvs-apache/rr-310");
		Thread.sleep(3000);
		driver.close();
	}
	
}
