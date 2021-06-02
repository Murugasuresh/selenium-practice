package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
	
	
	@Test
	@Parameters("Name")
	public void inputname(String name) {	
	System.out.println("This name is" + name);
	}
}
