package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile 
 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Seleium\\Selenium\\Auto123\\TestData\\TestData.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		
		String urlFromPropertyFile = prop.getProperty("url");
		System.out.println(urlFromPropertyFile);
		
		String browserFromPropertyFile = prop.getProperty("browser");
		System.out.println(browserFromPropertyFile);
		
		String usernameFromPropertyFile = prop.getProperty("username");
		System.out.println(usernameFromPropertyFile);
		
		String passwordFromPropertyFile = prop.getProperty("password");
		System.out.println(passwordFromPropertyFile);
		
		

	}

}
