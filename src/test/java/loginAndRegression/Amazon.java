package loginAndRegression;

import org.openqa.selenium.By;

public class Amazon extends Baseclass {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium//chromedriver.exe");
		//WebDriver driver = new ChromeDriver( );
		Amazon az= new Amazon();
		driver=az.getBrowserInstance("Chrome");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.linkText("Made for Amazon")); 
		driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li/span/a/div/label/i")).click();
		driver.findElement(By.className("a-section a-spacing-small a-spacing-top-small"));
		System.out.print("Amazon is close");
		driver.quit();
	}

}