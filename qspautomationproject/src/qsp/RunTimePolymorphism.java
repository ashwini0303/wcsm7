package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTimePolymorphism {

	public static void main(String[] args) {
	  WebDriver driver;
	  Scanner sc= new Scanner (System.in);
	  System.out.println("Enter the Browser which you want to open ");
	  String browserValue=sc.nextLine();
	  
	  if(browserValue.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.instagram.com");
	  }
	  else if(browserValue.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.instagram.com");
		  
	  }
	  else if(browserValue.equalsIgnoreCase("actitime"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("http://127.0.0.1/login.do;jsessionid=aae5tnlt6njgd");
		  
	  }
	  else
	  {
		  System.out.println("Enter valid input ");
	  }
		  

	}

}
