package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashboardPage extends TestBase{
	
	@FindBy(xpath = "//span[@class='nickname']") private WebElement nickname;
	@FindBy(xpath = "//span[@class='user-id']") private WebElement profileId;
	@FindBy(xpath = "//h4[@class='username']") private WebElement profileName;
	@FindBy(xpath = "//div[@class='email']") private WebElement email;
	
	public DashboardPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateNickname()
	{
		return nickname.getText();
	}
	public String validateProfileId()
	{
		return profileId.getText();		
	}
	public void clickProfileId()
	{
		profileId.click();
	}
	public String validateProfileName()
	{
		return profileName.getText();
	}
	public String validateEmail()
	{
		return email.getText();
	}


}
