package Assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();   //open the chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		
		WebElement frm = driver.findElement(By.xpath("//iframe[@id='chat-widgetrehbdhew']"));
		Thread.sleep(3000);
		driver.switchTo().frame(frm);
		Thread.sleep(3000);
		WebElement chat=driver.findElement(By.xpath("//button[@aria-label='Open LiveChat chat widget']"));
	    chat.click();
	    
	    


	}

}
