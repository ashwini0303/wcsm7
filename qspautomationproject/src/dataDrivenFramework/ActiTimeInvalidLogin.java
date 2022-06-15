package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataDriven.Flib;

public class ActiTimeInvalidLogin {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=bykqmjkvlfrt");

		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		Thread.sleep(1000);
		//accessing the generic reusable  non static method by creating the object
		Flib flib = new Flib();
		int rc = flib.getrowCount("./data/ActiTimeTest.xlsx","invalidcreds");


		for(int i=1;i<=rc;i++)
		{
			String username = flib.readData("./data/ActiTimeTest.xlsx","invalidcreds", i, 0);
			String password = flib.readData("./data/ActiTimeTest.xlsx","invalidcreds", i, 1);

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
		

			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();


	}

}}
