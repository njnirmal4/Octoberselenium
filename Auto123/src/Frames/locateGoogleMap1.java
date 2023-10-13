package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateGoogleMap1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://www.google.com/");
	      
	      driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();
	      driver.switchTo().frame("app");
	      
	      driver.findElement(By.xpath("//span[ text()='Maps']")).click();
	      WebElement SearchBox = driver.findElement(By.id("searchboxinput"));
	      
	      SearchBox.sendKeys("Noida");
	      SearchBox.sendKeys(Keys.ENTER);
	      
	      if(driver.getPageSource().contains("Noida"))
	      {
	    	  System.out.println("Pass: The Location is Verified");
	      }
	      else
	      {
	    	  System.out.println("Fail: The Location is not Verified");
	      }
	      
	      
	

	}

}
