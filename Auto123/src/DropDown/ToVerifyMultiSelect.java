package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyMultiSelect {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://demoqa.com/select-menu");
	      
	      WebElement colordropdown = driver.findElement(By.id("oldSelectMenu"));
	      Select select = new Select(colordropdown);
	     boolean multiSelect = select.isMultiple();
	      //Iteratpr itr =l1.listiterator();
	     if(multiSelect)
	    	
	     {
	    	 System.out.println("Pass:The dropdown is Multiselected");
	     }
	     else
	     {
	    	 System.out.println("Fail:The dropdown is not Multiselected");
	     }
	}

}
