package Scenarioa11to20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario20 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		 WebElement target = driver.findElement(By.xpath("//a[@title='Coins']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(target).perform();
	     driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-10gms,m']")).click();
	     Thread.sleep(4000);
	     driver.close();
	   
	}

}
