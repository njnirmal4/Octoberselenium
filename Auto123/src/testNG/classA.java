package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classA 
{
	@Test
	public void a()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	}

}
