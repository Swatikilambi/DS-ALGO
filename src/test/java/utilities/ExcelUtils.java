package utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelUtils {
	
	static int rowcount;
	
	//int j=0;
	/*public static void main(String args[])
	{
		ExcelUtils a= new ExcelUtils();
		a.GetRowcount();
		GetLoginCredentials("Sheet1",1,0);
		//a.GetPassword();
	}*/
	/*public void getRowcount()
	{
		try
		{
			
			String prjectpath = System.getProperty("user.dir");
			XSSFWorkbook workbook = new XSSFWorkbook(prjectpath +"\\Excel\\LoginDetails.xlsx");
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			rowcount= sheet.getPhysicalNumberOfRows();
			System.out.println("Number of Rows: " + rowcount);
		}
		 catch (IOException e) {
				System.out.println(e.getMessage());
				e.getCause();
				e.printStackTrace();
			}
		}*/

	public static String getLoginCredentials(String sheetName,int rowNumber)
	{
		String username = null;
		String password = null;
		try
		{
			String projectpath = System.getProperty("user.dir");
			XSSFWorkbook workbook = new XSSFWorkbook(projectpath +"\\Excel\\LoginDetails.xlsx");
			XSSFSheet sheet = workbook.getSheet(sheetName);
			for(int j=0;j<1;) 
			{
			
				username= sheet.getRow(rowNumber).getCell(j++).getStringCellValue();
			
				password= sheet.getRow(rowNumber).getCell(j).getStringCellValue();
			
				System.out.println("username: "+username);		
				System.out.println("Password: "+password);	
			}
			
		}catch (IOException e) {
			System.out.println(e.getMessage());
			e.getCause();
			e.printStackTrace();
		}
		return username+"-"+password;
	}
}
