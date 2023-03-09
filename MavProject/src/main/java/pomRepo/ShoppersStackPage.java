package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStackPage {
	public ShoppersStackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "loginBtn")
	private WebElement loginButton;
	
	@FindBy(xpath = "//button[text()='shop products']")
	private WebElement shopProduct;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getShopProduct() {
		return shopProduct;
	}
	
	

}
