package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         //how to close all the browser without using quit method
	   driver.get("http://www.omayo.blogspot.com/");
	   driver.findElement(By.xpath("//a[.='Open a popup window'] ")).click();
	   Set<String> allHandles = driver.getWindowHandles();
	   
	   for(String wh:allHandles)
		 {
			driver.switchTo().window(wh).close();

		 }
	}

}
