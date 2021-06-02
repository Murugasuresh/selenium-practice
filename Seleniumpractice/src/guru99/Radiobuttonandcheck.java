package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonandcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    
    String url ="http://demo.guru99.com/test/facebook.html";
    
    driver.get(url);
    WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
    for (int i=0; i<2; i++) {											
        chkFBPersist.click (); 			
        System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
    }		
	//driver.close();		
    		  
}
}

    
   
    
    
	/*
	 * WebElement radio1 = driver.findElement(By.id("vfb-7-1")); WebElement radio2 =
	 * driver.findElement(By.id("vfb-7-2"));
	 * 
	 * radio1.click(); System.out.println("Radio1 button is selected");
	 */
    
    
	/*
	 * WebElement check1 = driver.findElement(By.id("vfb-6-0")); WebElement check2 =
	 * driver.findElement(By.id("vfb-6-1")); WebElement check3 =
	 * driver.findElement(By.id("vfb-6-2"));
	 * 
	 * check1.click();
	 *//*
		 * check2.click(); check3.click();
		 */
      
      
	/*
	 * if(check1.isSelected()) { System.out.println("Check box is togged on"); }
	 * 
	 * else { System.out.println("Check box is toggeled off"); }
	 * 
	 * System.out.println("All the Check box is selected");
	 * 
	 * 
	 * driver.close(); }
	 * 
	 * }
	 */