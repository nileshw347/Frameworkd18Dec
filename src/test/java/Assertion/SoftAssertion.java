package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void test1()
	{
		SoftAssert s = new SoftAssert();
		System.out.println("Test1 is started");
		s.assertEquals("Nilesh1", "Nilesh", "Test case is fail");
		System.out.println("Soft Assert works after failing");
		
		s.assertEquals(200, 200);
		System.out.println("Soft assert works for passing");
		System.out.println("-----------------------------");
		
		s.assertAll();
	}
	@Test
	public void test2()
	{
		SoftAssert s1 = new SoftAssert();
		System.out.println("Test2 is started");
		s1.assertTrue(false, "Test fail because of wrong input");
		System.out.println("Test is fail");
		
		s1.assertTrue(true);
		System.out.println("Test is pass");
		
		s1.assertAll();
	}
	
}
