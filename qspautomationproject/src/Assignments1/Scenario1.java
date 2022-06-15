package Assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Scenario1 {

	static
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args)throws InterruptedException {
			
			
			ChromeDriver driver =new ChromeDriver();   //open the chrome browser
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			Thread.sleep(10000);
			driver.findElement(By.xpath("//input[@type='email'] ")).sendKeys("abp90patil@gmail.com");
			driver.findElement(By.xpath("//span[.='Next'] ")).click();

	}
//scenario1
}
