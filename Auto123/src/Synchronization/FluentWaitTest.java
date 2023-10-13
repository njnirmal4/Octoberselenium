package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitTest {
	

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		 
		 driver.findElement(By.id("email")).sendKeys("njnirmaljoshi7@gmail.com");
		 WebElement continueButton = driver.findElement(By.xpath("//button[@data-continue-to=\"password-container\"]"));
		//Declare and initialise Fluent wait
		 
		FluentWait wait = new FluentWait(driver);
		//specify the Timeout of the wait
		
	     wait.withTimeout(Duration.ofSeconds(20));
	     //Specify the Polling Time
		 wait.pollingEvery(Duration.ofMillis(100));
		 //until condition
		 wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		 //Specify what exception to ignore
		 wait.ignoring(Exception.class);
		 //we can click on continue button by this command 
		 continueButton.click();
		 
		 
		 

	}

}
