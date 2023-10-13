package RadioButton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectTheRadioButton {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://demoqa.com/radio-button");
	      
	      WebElement radio = driver.findElement(By.name("like"));
	      radio.click();
	      
	      
	     // Actions action = new Actions(driver);
	     // action.click(radioElement).perform();
	     // boolean select = radioElement.isSelected();
	      
	      
	     //if(select==false)
	     // {
	    	 // radioElement.click();
	     // }
	      
	      
	      
		

	}

}
