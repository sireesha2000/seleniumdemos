package learnTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallelexecution {
	public WebDriver driver;
    @Test
    public void EdgeTest() {	 
        
    	System.setProperty("webdriver.edge.driver", "C:\\selenium software\\edgedriver_win32\\msedgedriver");
		
		WebDriver driver=new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
     }

    @Test
	public void ChromeTest()
	{ 
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	}
	
}
