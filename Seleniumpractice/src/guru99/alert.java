package guru99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        String baseurl ="http://demo.guru99.com/test/delete_customer.php";
        driver.get(baseurl);
        
              driver.findElement(By.name("cusid")).sendKeys("123456");
              driver.findElement(By.name("submit")).click();
        
               Alert alert = driver.switchTo().alert();
               
               String output = alert.getText();
               
               System.out.println(output);
               
               alert.accept();
               
               Alert alert2 = driver.switchTo().alert();               
               
               alert2.accept();

	}

}
