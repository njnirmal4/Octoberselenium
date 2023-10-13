package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("Data base connection is Established");
		
	}
	
	@BeforeTest
	public void bt()
	{
		System.out.println("Parallel Execution is started");
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("Launch the Browser");
		System.out.println("Navigate to the URL");
	}
	
	@BeforeMethod
	public void bm()
	{
		System.out.println("Login to the Application");
	}
	
	@AfterMethod
	public void am()
	{
		System.out.println("The Logout from the Application");
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("Close the Browser");
	}
	
	@AfterTest
	public void at()
	{
		System.out.println("Parallel execution stopped");
	}
	
	@AfterSuite
	public void as()
	{
		System.out.println("Database connection is stopped");
	}

}
