package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonAssign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	   driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite'] ")).click();
	    driver.findElement(By.id("a-autoid-0-announce")).click();
	    
	}

}
