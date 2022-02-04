package newproject.newproject_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenimage {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		Thread.sleep(5000);
		
	 List<WebElement> images =driver.findElements(By.tagName("img"));
		
		

}
}

