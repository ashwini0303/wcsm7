package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");//provide the path of file
		Workbook wb = WorkbookFactory.create(fis);//make file ready for read operation
		Sheet sh = wb.getSheet("Sheet1");//get into sheet
		Row row = sh.getRow(2);//get into desired row
		Cell cell = row.getCell(1);//read desired col/cell
		String data=cell.getStringCellValue();//read data from that cell
		System.out.println(data);//print the data
		
	
		
		
	}

}
