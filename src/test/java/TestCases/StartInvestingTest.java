package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.StartInvesting;

public class StartInvestingTest extends TestBase{
	LoginPage login;
	StartInvesting invest;

	public StartInvestingTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() throws EncryptedDocumentException, IOException, InterruptedException
	{
		initialization();
		login = new LoginPage();
		invest = new StartInvesting();
		login.loginZerodhaAcc();
		invest.clickStartInv();
	}
	
	@Test
	public void completeGetOrder() throws InterruptedException, EncryptedDocumentException, IOException
	{
		invest.buyStock();
	}
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	

}
