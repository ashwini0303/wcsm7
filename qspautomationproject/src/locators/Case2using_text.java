package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Case2using_text {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	   driver.get("https://twitter.com/");
	   Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign up with phone or email']")).click();
		
		
		
		
	}	

}
