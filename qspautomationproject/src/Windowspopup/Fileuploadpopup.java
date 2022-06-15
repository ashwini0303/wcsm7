package Windowspopup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileuploadpopup {

	
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://127.0.0.1/login.do;jsessionid=fn5mkch3nd1fc");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("12");
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.linkText("Settings")).click();
			driver.findElement(By.partialLinkText("Logo")).click();
			driver.findElement(By.id("uploadNewLogoOption")).click();
			 Actions act=new Actions(driver);
			 WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
			 act.doubleClick(target).perform();
			 File abs=new File("./autoscripts/fu1.exe");
			 String abspath= abs.getAbsolutePath();
			 Runtime.getRuntime().exec(abspath);
			 Thread.sleep(4000);
			 Runtime.getRuntime().exec(abspath);
			 Thread.sleep(4000);
			 
			 
			 
			
			

	}

}
