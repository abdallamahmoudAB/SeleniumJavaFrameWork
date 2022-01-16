package seleniumFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;
public class GoogleSearchTest {
	
	static WebDriver driver= null;

	public static void main(String[] args) {
		
		googlesearch();
	}

	
	public static void googlesearch() {
		
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		 driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("hello world");
		//driver.findElement(By.name("btnK")).click();
		
		GoogleSearchPage.textbox_search(driver).sendKeys("hello world");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		// how to press Enter on keyboard
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
	}
	
	
	
	
	
	
	
}

