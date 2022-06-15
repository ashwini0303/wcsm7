package methodsOfSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByIndex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	   driver.get("file:///C:/Users/admin/Desktop/html/multipleselect%20dropdown.html");
	   WebElement dropdownelement=driver.findElement(By.id("menu"));
	   Select sel=new Select(dropdownelement);
	 
		 sel.selectByVisibleText("Dosa");
		 Thread.sleep(2000);
	     sel.deselectByIndex(5);
	}

}
