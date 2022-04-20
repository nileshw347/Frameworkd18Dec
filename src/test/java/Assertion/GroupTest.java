package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	
	@Test(groups = "Sanity")
	public void test1()
	{
		System.out.println("Test1");	}
	@Test (groups = "Regression")
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test (groups = {"Sanity", "Regression"})
	public void test3()
	{
		System.out.println("Test3");
	}
	@Test (groups = {"Sanity", "Regression"})
	public void test4()
	{
		System.out.println("Test4");
	}
	@Test (groups = "Regression")
	public void test5()
	{
		System.out.println("Test5");
	}
	@Test (groups = "Sanity")
	public void test6()
	{
		System.out.println("Test6");
	}

}
