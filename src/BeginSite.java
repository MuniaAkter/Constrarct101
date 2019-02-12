import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BeginSite {
	WebDriver dr;
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/muniaakter/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return dr;
	}
	
	
	public void gitadd() {
		
	}

	public void closeDriver () throws InterruptedException{
		Thread.sleep(3000);
		dr.quit();
		
	}


}
