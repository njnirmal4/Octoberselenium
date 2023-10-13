package dataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveTheData {
//java.lang.NullPointerException
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		FileReader reader = new FileReader("D:\\Seleium\\Selenium\\Auto123\\TestData\\TestData.properties");
		Properties props = new Properties();
		props.load(reader);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(props.getProperty("Login"));

		Thread.sleep(2000);
		driver.close();
		

	}

}
