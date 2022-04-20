package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{
	public LoginPageTest() throws IOException 
	{
		super();
	}


	public LoginPage login;
	
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		login = new LoginPage();
	}
	
	@Test (priority = 2, enabled = true)
	public void validateLoginPageTitleTest() 
	{
		String expZerodhaTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		String actZerodhaTitle = login.validateLoginPageTitle();
		Assert.assertEquals(actZerodhaTitle, expZerodhaTitle);
		Reporter.log(actZerodhaTitle);
	}
	@Test (dependsOnMethods = "validateLoginPageTitleTest", priority = 3 , enabled = true)
	public void validateKiteLogoTest()
	{
		boolean kiteLogo = login.validateKiteLogo();
		Assert.assertEquals(kiteLogo, true);
		Reporter.log("Kite Logo is " + kiteLogo);
	}
	@Test (priority = 4, enabled = true , invocationCount = 3)
	public void validatZerodhaLogoTest()
	{
		boolean zerodhaLogo = login.validatZerodhaLogo();
		Assert.assertEquals(zerodhaLogo, true);
		Reporter.log("Zerodha Logo is " + zerodhaLogo);
	}
	@Test (priority = 1 , enabled = true) //timeOut = 500
	public void loginZerodhaAccTest() throws InterruptedException
	{
		login.loginZerodhaAcc();
	}
	
	
	@AfterMethod
	public void close() throws InterruptedException
	{
		driver.close();
	}

}


//    * keyWords in Framework *

//      1. dependsOnMethods - it checks whether perticular method is depend on that method which we declare.
//                          - if 1st method get fail then dependent method will get skip.
//                          - dependent method will execute only when 1st method will get pass.
//                          
//      2. priority         - this keyword give priority to the perticular method for execute on which time
//                          - e.g. (priority = 1, priority = 2)
//                          - And if we give priority in (-ve) digit then it give priorty to the small number we declare.
//                          - priority of execution is depend upon the alphabets and numbers.
//
//      3.enable            - this keyword is used to enable or disable perticular method
//                          - if we use/give value "true" then method will get execute
//                          - if we use/give value "false" then method will not execute
//
//      4. invocationCount  - this keyword is use to execute perticular method multiple times
//                          - e.g. (invocationCount = 5) ---> method execute 5 times
//
//      5. timeout          - this keyword is use to set time for method execution means if our execution will not complete 
//                            in given time then method will be fail.




