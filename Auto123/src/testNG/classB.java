package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class classB 
{
	@Test
	public void b()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

}
