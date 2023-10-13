package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class loadThePropertiesFile 
{

	public static void main(String[] args) 
	{ 
	   Properties properties = new Properties();
		  try {
		        FileInputStream fileInputStream = new FileInputStream("D:\\Seleium\\Selenium\\Auto123\\TestData\\TestData.properties");
		        properties.load(fileInputStream);
		        fileInputStream.close();
		        } 
		  catch (IOException e) {
		            e.printStackTrace();
		        }
		    }

	}


