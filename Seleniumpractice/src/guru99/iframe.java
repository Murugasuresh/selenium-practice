package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        String baseurl ="https://ui.cogmento.com/";
       
        
       driver.get(baseurl);
       driver.manage().window().maximize();
       Thread.sleep(10000);
		
		  WebElement emailid = driver.findElement(By.xpath(
		  "/html/body/div[1]/div/div/form/div/div[1]/div/input")); emailid.click();
		  emailid.sendKeys("murugasuresh.k@gmail.com"); WebElement pass =
		  driver.findElement(By.name("password")); pass.click();
		  pass.sendKeys("Muruga@2012");
		 
       WebElement Loginbutton = driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']"));
       Loginbutton.click();
       
       
       Thread.sleep(10000);
       WebElement icon = driver.findElement(By.xpath("(//*[@class='users icon'])"));
       
       
       
       
       Actions contacts = new Actions(driver);
       Action mousehover = contacts.moveToElement(icon).build();
       mousehover.perform();
       
      Thread.sleep(10000);
      WebElement add = driver.findElement(By.xpath("(//i[@class='plus inverted icon'])[2]"));
       
      Actions click = new Actions(driver);
      Action clickadd = click.moveToElement(add).build();
      clickadd.perform(); 
	  add.click(); 
		      
      WebElement days = driver.findElement(By.xpath("//input[@name ='day']"));
      days.click();
	  days.sendKeys("10");
	  
	  
        
	}
	
}

