package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String url = "http://demo.guru99.com/test/newtours/register.php";
	    
	    driver.get(url);
	    driver.manage().window().maximize();

	    
	       WebElement Dropdown = driver.findElement(By.name("country"));
	       
	       Select Dropdown1 = new Select(Dropdown);
	      
	       Dropdown1.selectByValue("ALBANIA");
	       
	       Thread.sleep(3000);
	       
	       Dropdown1.selectByIndex(3);
	       Dropdown1.selectByVisibleText("BAHRAIN");
	       
	       System.out.println("State is selected");
	       
	       
			/* driver.close(); */
	       
	       
	       
	       
}

}
