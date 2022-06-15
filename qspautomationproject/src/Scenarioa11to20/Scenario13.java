package Scenarioa11to20;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario13 {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			driver.get("https://www.bluestone.com/");
		    driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		    driver.findElement(By.xpath("//span[.='Offers ']")).click();
		    Thread.sleep(4000);
		   driver.findElement(By.xpath("//span[.='Offers']")).click();
		    WebElement target = driver.findElement(By.xpath("//span[@class='title style-fill i-right']"));
		   Actions act=new Actions(driver);
		    act.moveToElement(target).perform();
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("//span[@data-displayname='30% Making Charge Off']")).click();
		   Thread.sleep(1000);
		    driver.close();

	}

}
