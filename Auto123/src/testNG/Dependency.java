package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency
{
	@Test(priority=1)
	public void login()
	{
		System.out.println("The User is Logged in");
	}
	
	@Test(priority=2, dependsOnMethods="login")
	public void searchProduct()
	{
		Assert.fail();
		System.out.println("The Product is Found");
	}	
	
	@Test(priority=3, dependsOnMethods="searchProduct")
	public void addToCart()
	{
		System.out.println("The Product is added to the cart ");
	}
	@Test(priority=4, dependsOnMethods="addToCart")
	public void payment()
	{
		System.out.println("The Product is paid");
	
	}
    
	@Test(priority=5, dependsOnMethods="login")
	public void logout()
	{
		System.out.println("The User has logged out");
	}

}
