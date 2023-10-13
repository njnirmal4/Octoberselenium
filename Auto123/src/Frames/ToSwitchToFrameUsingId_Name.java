package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToFrameUsingId_Name {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("file:///D:/HTML/insideframe.html");
	      
	      driver.switchTo().frame("demoFrame");
	      driver.findElement(By.xpath("//input[@text()=\"checkbox\"]")).click();
	      
	      
	      
		
	}

}
