package POP_UP;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javScriptPopUp {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      driver.get("https://demoqa.com/alerts");
	      
	      driver.findElement(By.id("alertButton")).click();
	      
	      Thread.sleep(2000);
	      Alert alert=driver.switchTo().alert();
	      alert.accept();
	      
	

	}

}
