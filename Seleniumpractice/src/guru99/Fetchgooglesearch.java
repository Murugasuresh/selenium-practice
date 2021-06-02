package guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetchgooglesearch {

	public static void main(String[] args) throws InterruptedException {
	
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
	    String url = "https://www.google.com/";
	    
	    driver.get(url);
	    driver.manage().window().maximize();

	           WebElement search = driver.findElement(By.name("q"));
	           search.sendKeys("game of thrones");
	           Thread.sleep(4000);
	           
	           List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	           
	           for (WebElement webElement : list) {
				        System.out.println(webElement.getText());
			}
	           
	}
}