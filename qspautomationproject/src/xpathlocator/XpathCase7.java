package xpathlocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        //Case 7 
	   driver.get("https://www.selenium.dev/downloads/");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("(//a[.='API Docs'])[5]")).click();

	}

}
