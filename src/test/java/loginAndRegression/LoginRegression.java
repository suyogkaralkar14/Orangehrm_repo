package loginAndRegression;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginRegression extends Baseclass {
	WebDriver driver;
	
	@BeforeTest
public void launchBrowser() {
		LoginRegression lar = new LoginRegression();
		driver= lar.getBrowserInstance("Chrome");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println(driver.getCurrentUrl());

	}
	
@Test (priority=1)
public void login() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println(driver.getCurrentUrl());
	
}

@Test (priority=0)

public void invalidpassword() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));	
}

@Test (priority=2)

public void invalidusername() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("ABC");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));	
}

@Test (priority=3)

public void invalidusernamepassword() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("ABC");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"));	
}


@Test (priority=3)
public void forgotpassword() {
	
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("123");
	driver.findElement(By.linkText("Forgot your password?")).click();
	System.out.println(driver.getCurrentUrl());	
}


@Test (priority=4)
public void forgotpasswordlinkpage() {
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	System.out.println(driver.getCurrentUrl());	
}

@Test (priority=5)
public void dashboardQuickLunch() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println(driver.getCurrentUrl());
	List<WebElement> wb=driver.findElements(By.className("quickLinkText"));
	for (WebElement re: wb) {
		String go = re.getText();
		System.out.println(go);
	}
	

}

@Test
 public void asignleave() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("Assign Leave")).click();
	driver.findElement(By.id("menu_leave_Entitlements")).click();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave", driver.getCurrentUrl());
	
	
}

@Test
public void leavelist() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("Leave List")).click();
	driver.findElement(By.id("menu_leave_viewLeaveList")).click();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList", driver.getCurrentUrl());
	
}


@Test
public void timesheet() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("Timesheets")).click();
	driver.findElement(By.id("menu_time_Timesheets")).click();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeTimesheet", driver.getCurrentUrl());
}

@Test
public void applyleave() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("Apply Leave")).click();
	driver.findElement(By.id("menu_leave_applyLeave")).click();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/leave/applyLeave", driver.getCurrentUrl());
}

@Test
public void myleave() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("My Leave")).click();
	driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/leave/viewMyLeaveList/reset/1", driver.getCurrentUrl());
}


@Test
public void mytimesheet() {
	driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");	
	driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.linkText("My Timesheet")).click();
	driver.findElement(By.id("menu_time_Timesheets")).click();
	Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/time/viewMyTimesheet", driver.getCurrentUrl());
}

}






