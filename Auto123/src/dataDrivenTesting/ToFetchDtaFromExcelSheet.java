package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDtaFromExcelSheet {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("D:\\Seleium\\Selenium\\Auto123\\TestData\\Book1.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(2);
		boolean customer1Status = cell.getBooleanCellValue();
		
		System.out.println("Customer 1 status is: "+customer1Status);
		long customer1PhoneNo = (long)row.getCell(1).getNumericCellValue();
		System.out.println("Customer 1 Phone No is: "+customer1PhoneNo);
		
		String customer1Name = row.getCell(0).getStringCellValue();
		System.out.println("Customer 1 Name is: "+customer1Name);
		
	
		
	}

}
