package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAnOption {

	public static void main(String[] args)
	{
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://www.facebook.com/");
	      
	      driver.findElement(By.linkText("Create new account")).click();
	     WebElement dayDropdown = driver.findElement(By.id("day"));
	     Select select1 = new Select(dayDropdown);
	     select1.selectByIndex(9);
	     
	     WebElement monthDropDown = driver.findElement(By.id("month"));
	     Select select2 = new Select(monthDropDown);
	     select2.selectByVisibleText("Oct");
	     
	    WebElement yearDropDown = driver.findElement(By.id("year"));
	    Select select3 = new Select(yearDropDown);
	    select3.selectByValue("2018");
	    
	}

}
