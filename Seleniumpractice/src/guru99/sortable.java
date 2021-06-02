package guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String baseurl ="http://www.leafground.com/pages/sortable.html";
	    
	    driver.get(baseurl);

		/*
		 * WebElement fromitem =
		 * driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[7]")); WebElement
		 * toitem = driver.findElement(By.xpath("//*[@id=\"sortable\"]/li[1]"));
		 */
	         
	    List<WebElement> listoption = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));	    
	    WebElement fromitem = listoption.get(6);
	    WebElement toitem = listoption.get(0);

	    Actions actions = new Actions(driver); 
	    actions.clickAndHold(fromitem);
	    actions.moveToElement(toitem);
	    actions.release(toitem);
	    actions.build().perform();
	    
	    System.out.println("option is performed");
	         
	}
	
	
	

}
