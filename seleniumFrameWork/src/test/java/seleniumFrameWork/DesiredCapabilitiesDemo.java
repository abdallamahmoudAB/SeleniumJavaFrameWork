package seleniumFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {
	
	public static void main(String[] args) {
		
		String projectpath= System.getProperty("user.dir");
		
		// to ignore protected mode settings
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("ignoreprotectedmodesettings", "true");
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/");
		 driver.findElement(By.name("q")).sendKeys("hello");
		 driver.findElement(By.name("btnK")).click();
		
	}

}
