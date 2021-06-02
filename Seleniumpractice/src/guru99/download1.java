package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class download1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String baseurl ="http://demo.guru99.com/test/upload/";
	    
	    driver.get(baseurl);

	    
	     WebElement filepath =  driver.findElement(By.id("uploadfile_0"));
	     filepath.click();
	     
	    filepath.sendKeys("C:\\Users\\91988\\Downloads\\testleaf.xlsx");
	     
	      WebElement checkbox =driver.findElement(By.id("terms"));
	      checkbox.click();
	      
	      
	    WebElement button = driver.findElement(By.id("submitbutton"));
	    button.click();
	         
	}

}
