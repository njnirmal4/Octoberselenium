package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest 
{
	@Test
	public void demoAssertion()
	{
		String a="Qspiders";
		String b="Jspiders";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b);
		System.out.println("Pass");
		sa.assertAll();
				
	}

}
