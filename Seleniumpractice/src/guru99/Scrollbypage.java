package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbypage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        String baseurl ="http://demo.guru99.com/test/guru99home/";    
       JavascriptExecutor js = (JavascriptExecutor)driver;    
       driver.get(baseurl);
		/* driver.manage().window().maximize(); */
       
		/* WebElement pin = driver.findElement(By.linkText("Pinterest")); */
       
     //This will scroll the web page till end.
         js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
