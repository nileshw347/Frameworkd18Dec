package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//img[@alt='Kite']") private WebElement kiteLogo;
	@FindBy(xpath = "//img[@alt='Zerodha']") private WebElement zerodhaLogo;
	@FindBy(xpath = "//input[@label='User ID']") private WebElement userIdTextBox;
	@FindBy(xpath = "//input[@type='password']") private WebElement passwordTextBox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath = "//input[@type='password']") private WebElement pinTextBox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueBtn;
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	public boolean validateKiteLogo()
	{
		return kiteLogo.isDisplayed();
	}
	public boolean validatZerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}
	public void loginZerodhaAcc() throws InterruptedException
	{
		userIdTextBox.sendKeys(prop.getProperty("userid"));
		passwordTextBox.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		Thread.sleep(1000);
		pinTextBox.sendKeys(prop.getProperty("pin"));
		Thread.sleep(1000);
		continueBtn.click();
		Thread.sleep(5000);
	}

}
