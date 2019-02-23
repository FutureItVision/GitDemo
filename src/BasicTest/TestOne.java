package BasicTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestOne {
	
	
	@Test
	public void firstTest(){
		
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElementByXPath(".//*[@id='header_logo']/a/img").isDisplayed();
	
	driver.close();
				
	}
}