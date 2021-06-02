package guru99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;

public class alertpopup {

	public static void main(String[] args)throws NoAlertPresentException,InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String url = "http://demo.guru99.com/test/delete_customer.php";
	    
	    driver.get(url);
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("5678");
	    driver.findElement(By.xpath("(//input[@type='submit'])")).click();
	    
	    
	   Alert alert = driver.switchTo().alert();
	   
	   String alertmessage =driver.switchTo().alert().getText();
	   
	   System.out.println("alertmessage");
       Thread.sleep(5000);

       alert.accept();
	   
	   
	   
	   
	   //get the alert message
	   
	                  	   
	    
	    
	    

	}

}
