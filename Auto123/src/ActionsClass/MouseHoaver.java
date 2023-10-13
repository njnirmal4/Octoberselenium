package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoaver {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://www.browserstack.com/");
	      ((JavascriptExecutor) driver).executeScript("scroll(0,300)");
	      
	     WebElement live = driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='Live']"));
	    WebElement automate = driver.findElement(By.cssSelector("div.product-cards-wrapper--click a[title='App Automate']"));
	    
	    
	   Actions action = new Actions(driver);
	   action.moveToElement(live).perform();
	   Thread.sleep(3000);
	   
	   action.moveToElement(automate).click().perform();
	   Thread.sleep(4000);
	   driver.quit();
	      
		

	}

}
