package basicTextScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.HomePage;
import POM.LoginPage;

public class ToVerifyLoginPage {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://demo.actitime.com/login.do");
		  
		 LoginPage login= new LoginPage(driver);
		 login.loginAction("admin", "manager");
		 
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.titleContains("Enter"));
		 
		 String homePageTitle = driver.getTitle();
		 
		 if(homePageTitle.contains(homePageTitle))
		 {
			 System.out.println("Pass:The Title is Verified");
		 }
		 else
		 {
			 System.out.println("Fail:The Title is not Verified");
		 }
		 
		HomePage home = new HomePage(driver);
		home.logoutAction();
		
		driver.quit();
		
		 
		
		

	}

}
