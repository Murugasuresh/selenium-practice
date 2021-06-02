package guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
        WebDriver driver = new ChromeDriver();
        String baseurl ="http://demo.guru99.com/test/newtours";
        String Expectedtitle = "Welcome: Mercury Tours";
        String actualtitle = "";
        
        driver.get(baseurl);
        driver.getTitle();
       
        actualtitle = driver.getTitle();
        
        if(actualtitle.contentEquals(Expectedtitle))
        {
        System.out.print("True");
        
        	
        }
        
        else
        {
        	System.out.print("False");	
        
 
	}

        driver.close();
}
}
