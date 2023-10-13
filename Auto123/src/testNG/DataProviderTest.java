package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest 
{
	//How will you execute same test script multiple times using multipla data
	//what will be the return type of data provider as 2 dimensional Onject array
	
	@DataProvider
	public Object[][] data() 
	{
		Object[][] arr=new Object[5][3];
		arr[0][0]="Noida" ;
		arr[1][0]="Delhi" ;
		arr[2][0]="Gurugram" ;
		arr[3][0]="Punjab" ;
		arr[4][0]="Uttarakhand" ;
		
		arr[0][1]="Malai Chaap" ;
		arr[1][1]="Chole Bhature" ;
		arr[2][1]="Daal Makhani" ;
		arr[3][1]="Lassi" ;
		arr[4][1]="Ragi" ;
		
		arr[0][2]="Check" ;
		arr[1][2]="Check" ;
		arr[2][2]="UnCheck" ;
		arr[3][2]="UnCheck" ;
		arr[4][2]="Check" ;
		
		
		
		return arr;

   }
	
	@Test(dataProvider="data")
	public void test(String place,String food,String status)
	{
		System.out.println("Place : "+place+"   "+"Food : "+food+" "+"Status:  "+status);
	}
	
	
	
}
