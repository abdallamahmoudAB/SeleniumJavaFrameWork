package seleniumFrameWork;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] args) {

		
		//create path for project location
		String projectpath= System.getProperty("user.dir");
		//System.out.println(projectpath);
		
		//System.setProperty("webdriver.gecko.driver", projectpath+"\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		// we use File.seperator instead of forward slash(/) cuz it might not work on all OS
		//System.setProperty("webdriver.chrome.driver", projectpath+ File.separator +"drivers"+File.separator+"chromedriver"+File.separator+"chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectpath+"/drivers/IEdriver/IEDriverServer.exe");
		//WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		 driver.findElement(By.name("q")).sendKeys("hello world");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
