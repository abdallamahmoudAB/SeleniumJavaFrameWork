package seleniumFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsBasicDemo {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		
		ExtentHtmlReporter htmlreporter= new ExtentHtmlReporter("extentreports.html");

		// create ExtentReports and attach reporter
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(htmlreporter);
	ExtentTest test1= extent.createTest("google search test1", "validate search function");
	
	String projectpath= System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
	 driver= new ChromeDriver();
	
	
	 test1.log(Status.INFO, "starting testcase");
	 
	 driver.get("https://google.com/");
	
	 
	 driver.findElement(By.name("q")).sendKeys("hello wolrd");
	 test1.pass("entered text in searchbox");
	 
	 driver.findElement(By.name("btnK")).click();
	 test1.pass("pressed search button");
	
	 extent.flush();
	
	}

}
