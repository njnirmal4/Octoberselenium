package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class towaitforwebdriver {

	public static void main(String[] args) 
	{
		//WebDriver driver =new ChromeDriver(); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebDriver fifthLink = (WebDriver) driver.findElement(By.xpath(null));
		//String fifthLinkURL = fifthLink.getAttribute("href");
		//System.out.println(fifthLinkURL);
		
		
		

	}

}
