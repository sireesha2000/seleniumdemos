package learnTestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
public class prioritydemo {
	WebDriver driver;
	@Test(description="Testcase to start application")
	public void startapp() {
		System.out.println("Start application");
		System.setProperty("webdriver.chrome.driver","C:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}
	@Test(priority = 1,description="Testcase to check login functionality")
	public void loginapp() {
		
		System.out.println("login to application");
		driver.findElement(By.id("Email")).sendKeys("mohant@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("mohant");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Test(priority = 2,description="Testcase to check signoff functionality")
	public void signoff() {
		System.out.println("logout");
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
}
