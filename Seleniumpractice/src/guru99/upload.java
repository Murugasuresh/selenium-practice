package guru99;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class upload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		//http://www.leafground.com/pages/upload.html
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    /*String baseurl ="http://www.leafground.com/pages/upload.html".*/
	    driver.manage().window().maximize();
	    driver.get("http://www.leafground.com/pages/upload.html");
	    
	    WebElement choosefile = driver.findElement(By.xpath("//*[@id=\'mydiv\']/input")); 
	    choosefile.click();
	    Thread.sleep(3000);

	    
	    String FilePath = "C:\\Users\\91988\\Desktop\\DSC_0435";
	    
	    StringSelection selection = new StringSelection(FilePath);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
	    
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
