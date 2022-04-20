package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Util1 {

	public static String readExcel(int rowNum, int colNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("E:\\software testing videos\\Automation\\Automation setup files\\eclipse\\Framework18Dec\\TestData\\Zerodha Test data.xlsx");
		Sheet zerodhaExcel = WorkbookFactory.create(file).getSheet("sheet1");
		return zerodhaExcel.getRow(rowNum).getCell(colNum).getStringCellValue();
	}
	
	public static void getScreenshot(WebDriver driver, String name) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\software testing videos\\Automation\\Automation setup files\\eclipse\\Framework18Dec\\Screenshot\\"+ name +".jpeg");
		FileHandler.copy(source, dest);
	}
}
