package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppersStackShopperSignupPage {
	public ShoppersStackShopperSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "First Name")
	private WebElement firstNameTextField ;
	
	@FindBy(id = "Last Name")
	private WebElement lastNameTextField;
	
	@FindBy(id = "Female")
	private WebElement femaleRadioButton;
	
	@FindBy(id = "Male")
	private WebElement maleRadioButton;
	
	@FindBy(id = "Other")
	private WebElement otherRadioButton;
	
	@FindBy(id = "Phone Number")
	private WebElement phoneNumberTextField;
	
	@FindBy(id = "Email Address")
	private WebElement emailIdTextField ;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField ;
	
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getOtherRadioButton() {
		return otherRadioButton;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getEmailIdTextField() {
		return emailIdTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmTextField() {
		return confirmTextField;
	}

	public WebElement getTermsAndConditionCheckBox() {
		return termsAndConditionCheckBox;
	}
	@FindBy(id = "Confirm Password")
	private WebElement confirmTextField ;
	
	@FindBy(id = "Terms and Conditions")
	private WebElement termsAndConditionCheckBox;
	
	public WebElement getRegisterButton() {
		return registerButton;
	}
	@FindBy(id = "Register")
	private WebElement registerButton;
	
	
		
	
	
}
