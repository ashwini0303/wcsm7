package pageobjectmodel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest
{

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();// open browser and launch browser
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		//get the row count to itterate for loop
		int rc = flib.getRowCount(EXCEL_PATH, "invalidcreds");
		
		for(int i=1;i<=rc;i++ )
		{
			String invalidUsername = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			//perform invalid login
			lp.actiTimeInvalidLogin(invalidUsername, invalidPassword);
		}
		//close the browser
		bt.tearDown();
		
		
	}

}
