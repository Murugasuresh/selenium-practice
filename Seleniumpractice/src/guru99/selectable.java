package guru99;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String baseurl ="http://www.leafground.com/pages/selectable.html";
	    driver.get(baseurl);
	    
	    Thread.sleep(4000);
	    List<WebElement> selectoption = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
	    int options = selectoption.size();
	    System.out.println(options);
	    
	    Actions actions = new Actions(driver);
	   //actions.keyDown(Keys.CONTROL).click(selectoption.get(0)).click(selectoption.get(1)).click(selectoption.get(2)).build().perform();
	    //actions.build().perform();
	    
	    actions.clickAndHold(selectoption.get(0)).clickAndHold(selectoption.get(1)).clickAndHold(selectoption.get(2)).build().perform();
	   

	}

}
