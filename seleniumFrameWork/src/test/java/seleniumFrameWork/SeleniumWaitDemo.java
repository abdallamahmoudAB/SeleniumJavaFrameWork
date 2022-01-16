package seleniumFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		
	 seleniumwaits();
	}
	
	static public void seleniumwaits() {
		
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("hello world");
		driver.findElement(By.name("btnK")).click();
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
	}

}
