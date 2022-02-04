package loginAndRegression;

import org.openqa.selenium.By;

public class Validusernamepassowrd extends Baseclass{

	public static void main(String[] args) {
		Validusernamepassowrd vup = new Validusernamepassowrd();
		driver= vup.getBrowserInstance("Chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		System.out.println(driver.getTitle().equals("OrangeHRM"));
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("Admin")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		

	}

}
