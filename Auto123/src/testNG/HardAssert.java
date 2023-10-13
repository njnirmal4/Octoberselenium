package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	@Test
	public void demo()
	{
		String a="Qspiders";
		String b="Qspiders";
		
		
		Assert.assertEquals(a, b);
		System.out.println("Control came to the next Line after checking String value");
		
		
		int c=100;
		int d=201;
		
		
		Assert.assertEquals(c, d);
		System.out.println("Control came to the next Line after checking int value");
		
		boolean e=true;
		boolean f=true;
		
		
		Assert.assertEquals(e, f);
		System.out.println("Control came to the next Line after checking boolean value");
		
	}

}
