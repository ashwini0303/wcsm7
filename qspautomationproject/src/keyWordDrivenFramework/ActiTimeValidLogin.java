package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		FileLibrary flib = new FileLibrary();
		String username = flib.readPropertyFile("./data/config.properties", "username");
		String password = flib.readPropertyFile("./data/config.properties", "password");
		//open the browser
		bt.openBrowser();
		Thread.sleep(3000);
		//perform login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);

		//close the browser
		bt.closeBrowser();

		
		
	}

}
