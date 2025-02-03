package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestJenkinsAndGit {
	WebDriver driver;
	
	@BeforeTest
	public void baseMethod() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
@Test
public void firstTest() {
	driver.get("chrome://settings/help");
	driver.close();
	System.out.println("Code updated");
	System.out.println("Commit");
	
	
}
}
