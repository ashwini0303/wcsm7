package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
         //how to close only child window
	   driver.get("http://www.omayo.blogspot.com/");
	   driver.findElement(By.xpath("//a[.='Open a popup window'] ")).click();
	   Thread.sleep(2000);
	    String parentHandle = driver.getWindowHandle();
        Set<String> allHandles = driver.getWindowHandles();
	   
	   for(String wh:allHandles)
		 {
		   if(!parentHandle.equals(wh))
				 
			 {
			   Thread.sleep(2000);
				 driver.switchTo().window(wh).close();
			 }
			 else
			 {
				 
			 }
		 }
	}

}
