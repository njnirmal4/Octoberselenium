package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert1 
{
	@Test
	public void demo()
	{
		String a="Qspiders";
		String b="Qspiders";
		
		
		Assert.assertEquals(a, b);
		System.out.println("Control came to the next Line after checking String value");
	}
	@Test
	public void demo1()
	{
		
		int c=100;
		int d=201;
		
		
		Assert.assertEquals(c, d);
		System.out.println("Control came to the next Line after checking int value");
	}
	@Test
	public void demo2()
	{
		
		boolean e=true;
		boolean f=true;
		
		
		Assert.assertEquals(e, f);
		System.out.println("Control came to the next Line after checking boolean value");
		
	}

}



