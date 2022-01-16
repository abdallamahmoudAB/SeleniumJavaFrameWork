package seleniumFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1_GoogleSearch_TestNGdemo2 {

	static WebDriver driver=null;

	@BeforeTest
public void setuptest() {
	
	String projectpath= System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
	 driver= new ChromeDriver();
}
	@Test
	public static void googlesearch2() {
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hello world");
		//driver.findElement(By.name("btnK")).click();
		
		// how to press Enter on keyboard
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	
	@Test
	public static void googlesearch3() {
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hello world");
		//driver.findElement(By.name("btnK")).click();
		
		// how to press Enter on keyboard
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void teardontest() {
		
		driver.close();
		driver.quit();
		System.out.println("test passed sucessfully");
	}
	
	
	
	
}

