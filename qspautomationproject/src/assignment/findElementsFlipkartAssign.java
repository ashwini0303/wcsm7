package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsFlipkartAssign {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	   driver.get("https://www.flipkart.com/");
	
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//button[.='✕'] ")).click();
	    
	   List <WebElement> suggestions = driver.findElements(By.xpath("//div[@class='xtXmba']"));
	    
		
	    for(WebElement sugg:suggestions)
	{
		String textOfWebElement = sugg.getText();
		System.out.println(textOfWebElement);
	}
	    
	    
	}

}
