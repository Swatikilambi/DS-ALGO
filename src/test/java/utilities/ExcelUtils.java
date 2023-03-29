package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class ExcelUtils {
	//public XSSFRow row;
	//public XSSFSheet sheet;
	//static int cellCount;
	/*Properties properties;
	public static FileInputStream excelFile;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;
	static String path;
	static String sheetname;
	//static String path=ConfigReader.getPath();
	//static String sheetname=ConfigReader.getSheetName();
	static int cellCount;
	
	public ExcelUtils() {

		ConfigReader propUtil = new ConfigReader();

		properties = propUtil.loadProperties();


		path = properties.getProperty("Testdata.excel.path");

		sheetname = properties.getProperty("sheetName");

	}
	public static void setExcelFileInfo() throws Exception
	{
		excelFile=new FileInputStream(path);
		workbook = new XSSFWorkbook(excelFile);
		sheet= workbook.getSheet(sheetname);

	}*/
	
	/*public int getColumnCount(int rowNumber) throws Exception {

		try {

			// Row = ExcelWSheet.getRow(RowNum).getLastCellNum();

			row = sheet.getRow(rowNumber);

			int cellCount = row.getLastCellNum();
			System.out.println("Cell count"+cellCount);
			return cellCount;

		} catch (Exception e) {

			return 0;

		} 

	}*/
	/*public static String getLoginCredentials(String sheetName,int rowNumber) throws IOException
	{
		String username = null;
		String password = null;
		for(int j=0;j<cellCount;) 
		{
		
			username= sheet.getRow(rowNumber).getCell(j++).getStringCellValue();
		
			password= sheet.getRow(rowNumber).getCell(j).getStringCellValue();
		
			System.out.println("username: "+username);		
			System.out.println("Password: "+password);	
		}
		return username+"-"+password;
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
