package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

import DataDriven.Flib;
public class ActiTimeLogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=bykqmjkvlfrt");

		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
s
		Thread.sleep(1000);
		//accessing the generic reusable  non static method by creating the object
		Flib flib = new Flib();
		//read the username
				String username = flib.readData("./Data/ActiTimeTest.xlsx","validcreds",1,0);
				//read the password
				String password = flib.readData("./Data/ActiTimeTest.xlsx","validcreds",1,1);

				//login operation
				driver.findElement(By.name("username")).sendKeys(username);
				driver.findElement(By.name("pwd")).sendKeys(password);
				driver.findElement(By.id("loginButton")).click();

	}

}
