package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Prog2 {
  @Test
  public void f() 
  {
	  
	  Reporter.log("f()",true);
  }
  @Test
  public void c() 
  {
	  
	  Reporter.log("c()",true);
  }
  @Test
  public void g() 
  {
	  
	  Reporter.log("g()",true);
  }
}
