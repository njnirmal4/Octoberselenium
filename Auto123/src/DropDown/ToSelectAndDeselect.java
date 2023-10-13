package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAndDeselect {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://demoqa.com/select-menu");
	      
	      WebElement cardropdown = driver.findElement(By.id("cars"));
	     Select select = new Select(cardropdown);
	     
	     select.selectByVisibleText("Audi");
	     Thread.sleep(2000);
	     select.selectByVisibleText("Volvo");
	     Thread.sleep(2000);
	     select.selectByVisibleText("Saab");
	     Thread.sleep(2000);
	     
	    //select.deselectByIndex(1);
	    //select.deselectByVisibleText("Audi");
	    //select.deselectByValue("volvo");
	     
	    List<WebElement> selectedOptions = select.getAllSelectedOptions();
	    int noOfSelectedOptions = selectedOptions.size();
	    System.out.println("The no of selected options are:"+noOfSelectedOptions);
	    for(WebElement option:selectedOptions)
	    {
	    	System.out.println(option.getText());
	    }
	    
	     WebElement firstSelectedElement = select.getFirstSelectedOption();
	     String firstSelectOption = firstSelectedElement.getText();
	     System.out.println("The First Selected Option is:"+firstSelectOption);

	}

}
