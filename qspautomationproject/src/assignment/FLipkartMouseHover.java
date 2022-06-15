package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FLipkartMouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	   driver.get("https://www.flipkart.com/");
	
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[.='✕'] ")).click();
	    
	    WebElement sugg = driver.findElement(By.xpath("//div[text()='Fashion']"));
	    Actions act=new Actions(driver);
	    act.moveToElement(sugg).perform();
	}

}
