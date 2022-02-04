package newproject.newproject_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidPassword {

	
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			System.out.println(driver.getTitle().equals("OrangeHRM"));
			driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
			driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("123");
			driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));
			driver.quit();
			

	}

}
