package testNG;

import org.testng.annotations.Test;

public class DepedenciesManagment {
	
	
  @Test(enabled=true)
  public void highschool() {
	  System.out.println("highschool");
  }
  @Test(dependsOnMethods="highschool")
  public void highersecondaryschool() {
	  System.out.println("highersecondaryschool");
  }
  
  @Test(dependsOnMethods="highersecondaryschool")
 public void Engineering() {
	 System.out.println("collage");
  }
}
