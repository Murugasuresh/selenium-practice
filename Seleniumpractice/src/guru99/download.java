package guru99;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class download {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    String baseurl ="http://www.leafground.com/pages/download.html";
	    
	    driver.get(baseurl);
	    WebElement filedownload = driver.findElement(By.linkText("Download Excel"));
	    filedownload.click();
	    Thread.sleep(3000);
	    File file = new File("C:\\Users\\91988\\Downloads");
	    
	    //C:\Users\91988\Downloads\testleaf.xlsx
	   
	    File[] folderlist = file.listFiles();
	    for (File file2 : folderlist) {
			if(file2.getName().equals("testleaf.xlsx"))
	    	System.out.println("File is present");
	    	break;
	    	
		}

	}
}
