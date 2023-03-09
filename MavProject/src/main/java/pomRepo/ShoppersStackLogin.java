package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStackLogin {
	public ShoppersStackLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(id = "Login")
	private WebElement loginButton;
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	@FindBy(id = "Create Account")
	private WebElement createAccount;
	
	@FindBy(id = "Forgot Password?")
	private WebElement forgotPasswordLink;
	
	

}
