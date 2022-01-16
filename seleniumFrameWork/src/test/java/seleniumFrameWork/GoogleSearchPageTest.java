package seleniumFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	static WebDriver driver= null;
	public static void main(String[] args) {
		
      googlesearchtest();
		
	}

	
	public static void googlesearchtest() {
		String projectpath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver.exe");
		 driver= new ChromeDriver();
		 
		 GoogleSearchPageObjects searchobj= new GoogleSearchPageObjects(driver);
		 driver.get("https://www.google.com/");
	searchobj.settestinsearchbox("a b c d");
	searchobj.clicksearchbutton();
	}
	
	
}
