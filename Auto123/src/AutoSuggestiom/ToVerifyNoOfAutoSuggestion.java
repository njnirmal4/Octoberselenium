package AutoSuggestiom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyNoOfAutoSuggestion {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("http://google.com/");
		 
		driver.findElement(By.name("q")).sendKeys("jordan");
		
		List <WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(text(),'ordan')]"));
		
		int noOfSuggestion=allSuggestion.size();
		System.out.println("The no of autosuggestion are:"+noOfSuggestion);
		 
		 
		

	}

}
