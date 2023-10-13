package POP_UP;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopUp {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  driver.get("https://www.google.com/");
		  
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  driver.get("https://www.flipkart.com/");
		  
		  driver.switchTo().newWindow(WindowType.WINDOW);
		  driver.get("https://www.instagram.com/");
		  
		  Set<String> allIds = driver.getWindowHandles();
		  
		  for(String id:allIds)
		  {
			  driver.switchTo().window(id);
			String currentTitle = driver.getTitle();
			
			if(currentTitle.contains("Google"))
			{
				System.out.println(driver.getTitle());
				break;
			}
		  }
		  
		
	}

}
