package testngpack;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
	@Test
	public void a()
	{
		Assert.fail();
		Reporter.log("Remo method",true);
}

}
