package scripting;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pomRepo.ShoppersStackLogin;
import pomRepo.ShoppersStackPage;
import pomRepo.ShoppersStackShopperSignupPage;
import utilityMethod.BaseClass;

public class Register extends BaseClass{
	@Test
	public void run() throws Exception{
		ShoppersStackPage homePage = new ShoppersStackPage(driver);
		homePage.getLoginButton().click();
	//	Assert.assertEquals(driver.getTitle(), "ShoppersStack | Login","not landed to loginpage");
		//Reporter.log("landed to login page",true);
		ShoppersStackLogin loginPage = new ShoppersStackLogin(driver);
		loginPage.getCreateAccount().click();
	//	Assert.assertEquals(driver.getTitle(), "ShoppersStack | Shopper | Signup","signup page not landed");
	//	Reporter.log("sign up page landed");
		ShoppersStackShopperSignupPage signupPage = new ShoppersStackShopperSignupPage(driver);
		signupPage.getFirstNameTextField().sendKeys("sharoon");
		signupPage.getLastNameTextField().sendKeys("rozario");
		signupPage.getMaleRadioButton().click();
		signupPage.getPhoneNumberTextField().sendKeys("82736864868");
		signupPage.getEmailIdTextField().sendKeys("sharon@gmail.com");
		signupPage.getPasswordTextField().sendKeys("password123");
		signupPage.getConfirmTextField().sendKeys("password123");
		signupPage.getTermsAndConditionCheckBox().click();
	}

}
