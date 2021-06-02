package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotationshierarchyexample {
  @Test
  public void test() {
	  System.out.println(" i am test ");

  }
  @Test
  public void test1() {
	  System.out.println(" i am test1 ");

  }
  @BeforeMethod
  public void beforeMethod() {
	   
	  System.out.println(" i am beforemethod ");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println(" i am afterMethod ");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println(" i am beforeClass ");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" i am AfterClass ");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(" i am beforeTest ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(" i am afterTest ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" i am beforesuit ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(" i am Aftersuit ");
  }

}
