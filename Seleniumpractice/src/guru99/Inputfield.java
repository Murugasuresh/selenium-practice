package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputfield {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    String baseurl ="http://demo.guru99.com/test/login.html";
    
    driver.get(baseurl);
    WebElement id = driver.findElement(By.id("email"));
    
  WebElement password =  driver.findElement(By.id("passwd"));
    
    id.sendKeys("ADC@gmail.com");
    password.sendKeys("Pass@123");
    
    
	/*
	 * id.clear(); password.clear();
	 */
   
    WebElement submitbutton = driver.findElement(By.id("SubmitLogin"));
   
   submitbutton.click();
   
  System.out.println("user logged successfully");
   
   driver.close();
   
 
    
    

}
}

