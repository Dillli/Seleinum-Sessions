package TestNGSessions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Testng {

	// preconditions --- starting with “before 
	@org.testng.annotations.BeforeSuite
	
	public void BeforeSuite()
	{
	System.out.println("@BeforeSuite");
	}
	@BeforeTest
	public void BeforeTest()
	{
	System.out.println("@BeforeTest");
	}
	@BeforeClass
	
	public void BeforeClass()
	{
	System.out.println("@BeforeClass");
	}
	@org.testng.annotations.BeforeMethod
	
	public void BeforeMethod()
	{
	System.out.println("@BeforeMethod");
	}
	// test case 
	@Test
	// post conditions --- starting with “After  
	
	public void Test()
	{
	System.out.println("@Test");
	}

	@AfterMethod 
	
	public void suite()
	{
	System.out.println("@AfterMethod");
	}
	
	@AfterClass 
	
	public void AfterClass()
	{
	System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void Aftertest()
	{
	System.out.println("Aftertest");
	}

}
