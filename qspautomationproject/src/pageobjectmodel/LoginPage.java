package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInCheckBox") WebElement keepmeLoginCheckbox;
	@FindBy(xpath="//img[contains(@src,'timer')]")private WebElement logo;
	@FindBy(id="licenseLink") private WebElement licenceLink;
	
	
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getKeepmeLoginCheckbox() {
		return keepmeLoginCheckbox;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getLicenceLink() {
		return licenceLink;
	}
	
	//generic reusable method to send username
	
	public void actiTimevalidLogin(String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
		
	}
	
	public void actiTimeInvalidLogin(String invalidUsername,String invalidPassword)
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginButton.click();
		usn.clear();
		
	}
	
	
	
	//operational methods
	
	

}
