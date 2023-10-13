package testNG;

import org.testng.annotations.Test;

public class DisableTestCase 
{
	@Test(priority=1)
	  public void goodMorning()
	  {
		  System.out.println("Good Morning");
	  }
	  
	  @Test (priority=2 , enabled=false)
	  public void breakFast()
	  {
		  System.out.println("Breakfast with Paratha");
	  }
	  @Test(priority=3)
	  public void work()
	  {
		  System.out.println("work");
	  }

}
