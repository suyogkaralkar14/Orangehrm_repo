package newproject.newproject_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle().equals("OrangeHRM"));
		driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/h1"));
		driver.quit();
		

	}

}

