package newproject.newproject_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import loginAndRegression.Baseclass;

public class invalidUsernamePassword extends Baseclass {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver;
		invalidUsernamePassword iup = new invalidUsernamePassword();
		driver=iup.getBrowserInstance("FireFox");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle().equals("OrangeHRM"));
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("ABC");	
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));
		//System.out.println(driver.getTitle().equals("Invalid credentials"));
	//driver.quit();

	}

}
