package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         //how to close only parent window
	   driver.get("http://www.omayo.blogspot.com/");
	   driver.findElement(By.xpath("//a[.='Open a popup window'] ")).click();
	   Thread.sleep(2000);
	   driver.close();

		 
	}

}
