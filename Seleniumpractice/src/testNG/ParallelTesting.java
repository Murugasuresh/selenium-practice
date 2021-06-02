package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void Openthegoogle() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://www.google.co.in");
	 driver.quit();
	
}
	@Test
	public void OpentheBing() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91988\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.bing.com");
		 driver.quit();

}
	
}