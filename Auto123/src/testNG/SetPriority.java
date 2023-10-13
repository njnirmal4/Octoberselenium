package testNG;

import org.testng.annotations.Test;

public class SetPriority 
{
	@Test(priority=1)
	public void login()
	{
		System.out.println("The User is Logged in");
	}
	
	@Test(priority=2)
	public void searchProduct()
	{
		System.out.println("The Product is Found");
	}
	
	@Test(priority=3)
	public void addToCart()
	{
		System.out.println("The Product is added to the cart ");
	}
	@Test(priority=4)
	public void payment()
	{
		System.out.println("The Product is paid");
	
	}
    
	@Test(priority=5)
	public void logout()
	{
		System.out.println("The User has logged out");
	}
	
}
