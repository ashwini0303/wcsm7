package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesBLuestoneAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	   driver.get("https://www.bluestone.com");
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class='lc-1x7wur2 e1dmt1bi0']")).click();
	   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ashwini");
	   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ap90patil@gmail.com");
	   driver.findElement(By.xpath("//input[@id='1apdomzham2_146917605549304831']")).sendKeys("9623954218");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
