package Assignments1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();   //open the chrome browser
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(10000);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		Thread.sleep(3000);
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		
	    Actions act=new Actions(driver);
	    act.dragAndDrop(src, dest).perform();


	}

}
