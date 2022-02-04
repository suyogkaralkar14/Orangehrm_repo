package newproject.newproject_1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {
	public static void main(String[]args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Selenium//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver(); 
		
		driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
WebElement element =driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img"));
Actions act=new Actions(driver);
act.contextClick(element).build().perform();
Robot rb = new Robot();
rb.keyPress(KeyEvent.VK_DOWN);
rb.keyRelease(KeyEvent.VK_DOWN);
rb.keyPress(KeyEvent.VK_ENTER);
rb.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(1000);
String tabhandler = driver.getWindowHandle();
Set<String> handles=driver.getWindowHandles();
for(String handlenames:handles) {
	driver.switchTo().window(handlenames);
	
}
 driver.findElement(By.linkText("Mi Mobile")).click();

 WebElement mobile = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
 //mobile.click();
// String title =driver.getTitle();
 //String value= driver.findElement(By.linkText("₹8,689")).getText();
// System.out.println(title );
 WebElement down= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select"));
 Select select =new Select(down);
 select.selectByIndex(4);
 
 
 

 
}
}