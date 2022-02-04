package newproject.newproject_1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import loginAndRegression.Baseclass;

public class InvaildUsername extends Baseclass{

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver;
		InvaildUsername iu = new InvaildUsername();
		driver=iu.getBrowserInstance("Chrome");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle().equals("OrangeHRM"));
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("ABC");	
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));
		driver.quit();

	}


}
