package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementMethod {

	   public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();

		   driver.get("http://127.0.0.1/login.do;jsessionid=1kdpgcwsn2wbm");
		   Thread.sleep(2000);
		  WebElement usernameTextBox = driver.findElement(By.xpath("//input[@name='username'] "));
		  usernameTextBox.sendKeys("admin");
		  System.out.println(usernameTextBox);
		  WebElement usernameTextBox1 = driver.findElement(By.xpath("//input[@name='pwd'] "));
		  usernameTextBox1.sendKeys("12");
		  System.out.println(usernameTextBox1);
		  driver.findElement(By.xpath("//a[@class='initial'] ")).click();
		  

	}

}
