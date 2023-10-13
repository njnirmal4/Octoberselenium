package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToClickAndHold {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://kirupa.com/html5/press_and_hold.htm#tutorialInformation");
	      
	      WebElement button = driver.findElement(By.id("item"));
	      
	     Actions action = new Actions(driver);
	     action.clickAndHold(button).perform();
	     Thread.sleep(2000);
	     action.release(button).perform();
	     
	      
		

	}

}
