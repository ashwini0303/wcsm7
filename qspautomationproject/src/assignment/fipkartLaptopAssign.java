package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fipkartLaptopAssign {

	   public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		   driver.get("https://www.flipkart.com/");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//button[.='✕'] ")).click();
		   driver.findElement(By.xpath("//input[@name='q'] ")).sendKeys("Laptop");
		   
		   driver.findElement(By.xpath("//button[@type='submit'] ")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[text()='Processor'] ")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[text()='Core i5']")).click();
		   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[text()='Brand'] ")).click();
		   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[text()='HP'] ")).click();
		  Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[text()='Operating System'] ")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[text()='Windows 10'] ")).click();
		   Thread.sleep(2000);
		   String price =driver.findElement(By.xpath("//div[text()='HP Core i5 11th Gen - (8 GB + 32 GB Optane/512 GB SSD/Windows 10 Home) 15s-FQ2071TU Thin and Light Lap...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		   Thread.sleep(2000);
		   System.out.println(price);
   
          
	}

}
