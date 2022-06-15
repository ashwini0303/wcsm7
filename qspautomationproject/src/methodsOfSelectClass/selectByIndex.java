package methodsOfSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	   driver.get("file:///C:/Users/admin/Desktop/html/Singleselectdropdown.html");
	   WebElement dropdownelement=driver.findElement(By.id("menu"));
	   Select sel=new Select(dropdownelement);
	   sel.selectByIndex(5);
	}

}
