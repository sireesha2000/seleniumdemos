package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependenciesdemo {
	WebDriver driver;
	@Test(description="Testcase to start application")
	public void startapp() {
		System.out.println("Start application");
		System.setProperty("webdriver.chrome.driver","C:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, "demowebshop");
	}
	@Test(dependsOnMethods = "startapp")
	public void loginapp() {
		
		System.out.println("login to application");
		driver.findElement(By.id("Email")).sendKeys("mohant@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("mohant");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Test(dependsOnMethods = "loginapp")
	public void signoff() {
		System.out.println("logout");
		driver.findElement(By.linkText("Log out")).click();
		
	}
	@Test(dependsOnMethods = "signoff",alwaysRun = true)
	public void close() {
		driver.close();
		
	}
}
