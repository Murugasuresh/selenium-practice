package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;




public class wgetdownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String url = "http://demo.guru99.com/test/yahoo.html";
	    
	    driver.get(url);
	    driver.manage().window().maximize();
	    
	    
	    WebElement button = driver.findElement(By.id("messenger-download"));
	              String location = button.getAttribute("href");
	              String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + location;
	              
	              
	              try {
	            	  
	            	        Process execution = Runtime.getRuntime().exec(wget_command);
	            	            int wait = execution.waitFor();
	            	            
	            	           System.out.println("finaloutput"+ wait);
					
				} catch (InterruptedException | IOException ex) {
			        System.out.println(ex.toString());

					
					// TODO: handle exception
				}

	}

}
