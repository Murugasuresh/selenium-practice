package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouseoveractions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	   String baseURl = "http://demo.guru99.com/test/newtours/index.php";
	   
	   driver.get(baseURl);           
       WebElement link_Home = driver.findElement(By.linkText("Home"));
       WebElement td_Home = driver
               .findElement(By
               .xpath("//html/body/div"
               + "/table/tbody/tr/td"
               + "/table/tbody/tr/td"
               + "/table/tbody/tr/td"
               + "/table/tbody/tr"));   
		/*
		 * Actions builder = new Actions(driver); Action mouseOverHome = builder
		 * .moveToElement(link_Home) .build();
		 */
       
       Actions building = new Actions(driver);
       Action mousehover = building.moveToElement(link_Home).build();
       
               
       
      String beforecolour = td_Home.getCssValue("background-color");
      
       System.out.println("Before hover:"+beforecolour );
       mousehover.perform();
       
       
       String aftercolour = td_Home.getCssValue("background-color");
        System.out.println("After hover:"+ aftercolour);
       
       
        
		/*
		 * String bgColor = td_Home.getCssValue("background-color");
		 * System.out.println("Before hover: " + bgColor); mouseOverHome.perform();
		 * bgColor = td_Home.getCssValue("background-color");
		 * System.out.println("After hover: " + bgColor);
		 */
       driver.close();
 	    
}
	
}