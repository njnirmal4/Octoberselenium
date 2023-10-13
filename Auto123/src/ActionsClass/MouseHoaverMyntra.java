package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoaverMyntra {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://www.myntra.com/");
	      
	      WebElement men = driver.findElement(By.xpath("//a[@data-group=\"men\"]"));
		  WebElement women = driver.findElement(By.xpath("//a[@data-group=\"women\"]"));
		  WebElement kids = driver.findElement(By.xpath("//a[@data-group=\"kids\"]"));
		  WebElement home = driver.findElement(By.xpath("//a[@data-group=\"home-&-living\"]"));
		  WebElement beauty = driver.findElement(By.xpath("//a[@data-group=\"beauty\"]"));
		  WebElement studio = driver.findElement(By.xpath("//a[@data-group=\"studio\"]"));
		  
		  Actions action = new Actions(driver);
		  action.moveToElement(men).perform();
		  Thread.sleep(3000);
		  
		  action.moveToElement(women).perform();
		  Thread.sleep(3000);
		  action.moveToElement(kids).perform();
		  Thread.sleep(3000);
		  action.moveToElement(home).perform();
		  Thread.sleep(3000);
		  action.moveToElement(beauty).perform();
		  Thread.sleep(3000);
		  action.moveToElement(studio).perform();
		  Thread.sleep(3000);
		  driver.quit();
		  
		  
		  
		  
		  
				 
		

	}

}
