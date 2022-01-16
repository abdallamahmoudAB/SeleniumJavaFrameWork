package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println("*****+ test started:"+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("*****+ test succesfull:"+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("*****+ test failed:"+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("*****+ test skipped:"+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("*****+ test completed:"+context.getName());
		
	}
	
	 

}
