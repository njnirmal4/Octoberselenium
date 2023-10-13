package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) 
	{
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.actitime.com/login.do");
	 
	WebElement username = driver.findElement(By.id("username"));
	WebElement password = driver.findElement(By.name("pwd"));
	driver.findElement(By.xpath("//div[text()='Login']"));
	
	String usenameTagname = username.getTagName();
	String passwordTagname = password.getTagName();	
	loginButton.g
	
	
	 
	}

}

