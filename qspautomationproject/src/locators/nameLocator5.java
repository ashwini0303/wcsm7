package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocator5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Login of flipkart website
	   driver.get("https://www.flipkart.com/account/login?ret=/");
	   driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("9623954218");
		driver.findElement(By.className("_2IX_2- _3mctLh VJZDxU")).sendKeys("12345");
		driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
	}

}
