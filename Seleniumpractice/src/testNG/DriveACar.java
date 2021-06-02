package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	
	
@Test(priority=0)
 public void Startthecar() {
      System.out.println("start the car");
           }
@Test(priority=1)     
  public void Firstgear() {
       System.out.println("put the first gear");
           }
@Test(priority=2)
  public void secondgear() {
	   System.out.println("put the second gear");
  }
@Test(priority=3)
  public void thirdgear() {
	  System.out.println("put the Third gear");

}
@Test(priority=4)
  public void fourthgear() {
	  System.out.println("put the fourth gear");
}
	  @Test(priority=5,enabled=false)
	  public void startthemusic() {
		  System.out.println("music is turned on");	  
	  

}

}