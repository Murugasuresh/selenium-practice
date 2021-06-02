package guru99;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String baseurl ="http://www.leafground.com/pages/Window.html";
	    
	    driver.get(baseurl);
	    
	       String oldwindows = driver.getWindowHandle();
	       
	     WebElement singlewindow = driver.findElement(By.id("home"));
	     singlewindow.click();
	     
	     Set<String> handles = driver.getWindowHandles();
	     
	   for (String newwindows : handles) {
		   
		   driver.switchTo().window(newwindows);
		   
		   ////*[@id='post-153']/div[2]/div/ul/li[1]
		   
		  WebElement editbox = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]"));
		  editbox.click();
		  
		  driver.close();
		  driver.switchTo().defaultContent();
		  		  
	}
			

	}

}
