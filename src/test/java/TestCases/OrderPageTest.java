package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import Pages.OrderPage;

public class OrderPageTest extends TestBase{
	LoginPage login;
	OrderPage order;
	public OrderPageTest() throws IOException
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws EncryptedDocumentException, IOException, InterruptedException
	{
		initialization();
		login = new LoginPage();
		order = new OrderPage();
		login.loginZerodhaAcc();
		order.clickOrderLink();
		order.clickGTTLink();
	}
	
	@Test
	public void placeOrderTest() throws EncryptedDocumentException, InterruptedException, IOException
	{
		order.placeOrder();
	}
	
	@AfterMethod
	public void exit(ITestResult it) throws IOException
	{
		if(ITestResult.FAILURE==it.getStatus())
		{
			Utility.Util1.getScreenshot(driver, it.getName());
		}
		driver.close();
		
	}

}
