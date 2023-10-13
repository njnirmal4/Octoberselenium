package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{
	WebDriver driver;
	
    @Parameters("browser")   
	@Test
	public void a(String browservar)
	{
		if (browservar.equals("chrome"))
		{
			 driver = new ChromeDriver();		
	}
	 if (browservar.equals("firefox"))
	 {
		 driver = new FirefoxDriver();
	 }
	 
	 if (browservar.equals("edge"))
	 {
		 driver = new EdgeDriver();
	 }
	 
	 driver.get("https://google.co.in/");

    }
	
}
