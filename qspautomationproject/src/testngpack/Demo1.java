package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
 
	@Test
  public void f()
  {
	  Reporter.log("Demo method",true);
  }
}
