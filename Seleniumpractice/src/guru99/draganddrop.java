package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String baseurl ="http://www.leafground.com/pages/drop.html";
	    
	    driver.get(baseurl);
	    
	       WebElement from = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	       WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	       
	       
	       Actions actions =new Actions(driver);
	       actions.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
	}

}
