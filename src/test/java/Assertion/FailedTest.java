package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest {                           //By using testNG-failed.xml file we can re-execute failed particular test cases. 
	                                                //This testNG-failed.xml file present in (Project=>Test output Folder=>testNG-failed.xml)
	@Test
	public void test1()
	{
		System.out.println("Test1");
		Assert.assertEquals("Nilesh", "Nilesh", "Print test1 When test case will fail");
		System.out.println("Test case is pass");
	}
	@Test
	public void test2()
	{
		System.out.println("Test2");
		Assert.assertEquals(300, 200, "Print test2 When test case will fail");
		System.out.println("Test case is pass");
	}
	@Test(groups = "Sanity")
	public void test3()
	{
		System.out.println("Test3");
		Assert.assertTrue(true, "Test3 is fail");
		System.out.println("Test case is pass");
	}
	@Test
	public void test4()
	{
		System.out.println("Test4");
		Assert.assertTrue(true);
	}
	@Test
	public void test5()
	{
		System.out.println("Test5");
		Assert.assertFalse(false);
	}
	@Test
	public void test6()
	{
		System.out.println("Test5");
		Assert.assertFalse(true);
	}
	
}
	
