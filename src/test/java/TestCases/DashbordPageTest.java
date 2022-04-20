package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;

public class DashbordPageTest extends TestBase {

	public DashbordPageTest() throws IOException 
	{
		super();
	}


	public DashboardPage dashbord;
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		dashbord = new DashboardPage();
		login = new LoginPage();
		login.loginZerodhaAcc();
	}
	
	@Test
	public void validateNicknameTest()
	{
		String dash = dashbord.validateNickname();
		Assert.assertEquals(dash, "Nilesh");
		Reporter.log(dash);
	}
	@Test
	public void validateProfileIdTest()
	{
		String proId = dashbord.validateProfileId();
		Assert.assertEquals(proId, "UMC868");
		Reporter.log(proId);
	}
	@Test
	public void validateProfileNameTest()
	{
		dashbord.clickProfileId();
		String proName = dashbord.validateProfileName();
		Assert.assertEquals(proName, "Nilesh Ambadas Wankhede");
		Reporter.log(proName);
	}
	@Test
	public void validateEmailTest()
	{
		dashbord.clickProfileId();
		String email = dashbord.validateEmail();
		Assert.assertEquals(email, "nileshw347@gmail.com");
		Reporter.log(email);
	}
	
	
	@AfterMethod
	public void close()
	{
		driver.close();
	}
}
