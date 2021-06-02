package guru99;

import java.io.InterruptedIOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String baseurl ="http://www.leafground.com/pages/autoComplete.html";
	    
	    driver.get(baseurl);
	    
	    
	    ////*[@id="tags"]
	    
	     WebElement coursename = driver.findElement(By.id("tags"));
	     coursename.sendKeys("s");
	     
	     Thread.sleep(4000);

	     List<WebElement> item = driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
	     
	     System.out.println(item.size());	     
	     for (WebElement webElement : item) {
	    	 
	    	if (webElement.getText().equals("Web Services")) {
	    	webElement.click();
	    	System.out.println("selecting"+webElement.getText());
	    	break;
	    	

	    }
	    	
		}
	}
}


