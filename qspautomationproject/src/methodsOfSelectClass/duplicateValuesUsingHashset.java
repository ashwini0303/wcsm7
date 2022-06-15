package methodsOfSelectClass;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicateValuesUsingHashset {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

	   driver.get("file:///C:/Users/admin/Desktop/html/multipleselect%20dropdown.html");
	   WebElement element=driver.findElement(By.id("menu"));
	   Select sel=new Select(element);
	  List<WebElement> options = sel.getOptions();//get all options
	  //declare a set to eliminate the duplicate values
	  HashSet<String>s=new HashSet <String>();
	  //read the list and get the text
	  
	  for(int i=0;i<options.size(); i++)
	  {
		  WebElement ops=options.get(i);
		  String text=ops.getText();
		  //add text to set so that duplicates won't be accepted
		  s.add(text);
		  
	  }
	  
	  for(String se:s)
	  {
		  
		  System.out.println(se);
	  }
	 
	}

}
