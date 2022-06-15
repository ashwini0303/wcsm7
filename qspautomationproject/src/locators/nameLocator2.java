package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocator2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Login of gmail
	   driver.get("https://www.gmail.com");
		driver.findElement(By.name("identifier")).sendKeys("abp90patil@gmail.com");
		
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
	}

}
