package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {

	WebDriver driver= null;
	
	By testbox_search= By.name("q");
	By button_search= By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver= driver;
	}
	
	public void settestinsearchbox(String test) {
		driver.findElement(testbox_search).sendKeys("text");
		
		
	}
	
	public void clicksearchbutton() {
		driver.findElement(button_search).click();
	}
	
}
