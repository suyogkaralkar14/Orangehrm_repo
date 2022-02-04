package loginAndRegression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
static WebDriver driver  = null;
	public WebDriver getBrowserInstance(String browsername) {
		
		 switch(browsername) {
		 case "Chrome":
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium\\Driver\\chromedriver_win32//chromedriver.exe");
		driver  = new ChromeDriver();
		return driver;
		
		 case"FireFox":
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium\\Driver\\geckodriver-v0.30.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
		
		default:
	
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium\\Driver\\chromedriver_win32//chromedriver.exe");
				driver  = new ChromeDriver();
				return driver;
		
		 
		
		 
		
	}
	}
}
	
	
