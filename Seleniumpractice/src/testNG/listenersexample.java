package testNG;

		
import org.testng.ITestListener ;
import org.testng.ITestResult ;	
import org.testng.ITestContext ;

public class listenersexample implements ITestListener {
	
	
	@Override		
    public void onFinish(ITestContext context) {					
        // TODO Auto-generated method stub	
		System.out.println("Completed of everthing");
        		
    }		

    @Override		
    public void onStart(ITestContext context) {					
        // TODO Auto-generated method stub	
    	
    	System.out.println("Beginning of everthing");
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {					
        // TODO Auto-generated method stub				
    	
    }		

    @Override		
    public void onTestFailure(ITestResult result) {					
        // TODO Auto-generated method stub				
        		
    	System.out.println("Testcase is failed");
    }		

    @Override		
    public void onTestSkipped(ITestResult result) {					
        // TODO Auto-generated method stub				
    	System.out.println("Testcase is skipped");
    }		

    @Override		
    public void onTestStart(ITestResult result) {					
        // TODO Auto-generated method stub		
    	System.out.println("Testcase is going to start");
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult result) {					
        // TODO Auto-generated method stub	
    	
    	System.out.println("Testcase is Passed");
        		
    }		
}

