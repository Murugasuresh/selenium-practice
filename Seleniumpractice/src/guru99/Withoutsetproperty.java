package guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Withoutsetproperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
	    String baseurl ="http://www.leafground.com/pages/Window.html";
	    driver.get(baseurl);

}
}