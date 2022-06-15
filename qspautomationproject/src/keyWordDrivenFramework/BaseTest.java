package keyWordDrivenFramework;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoContent {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
		FileLibrary flib=new FileLibrary();
		String browserValue = flib.readPropertyFile(PROP_PATH,"browser");
		String url=flib.readPropertyFile(PROP_PATH,"url");
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
					
			}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			
		}
		else
		{
			System.out.println("enter correct choice");
		}
		
		
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
