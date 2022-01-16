package seleniumFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		
		googlesearch();
	}

	
	public static void googlesearch() {
		
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hello world");
		//driver.findElement(By.name("btnK")).click();
		
		// how to press Enter on keyboard
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	
	
	
	
	
	
	
}

