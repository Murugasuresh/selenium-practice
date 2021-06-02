package testNG;

import org.testng.annotations.DataProvider;

public class dataproviderexample {
	
	
	String[][] data ={
			{"ADC@gmail.com","Pass@123"},
			{"ADC@gmail.com","Pass@12"},
			{"AD@gmail.com","Pass@123"},
			{"AD@gmail.com","Pass@23"},
			
	};
	
	
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;
	}

}
