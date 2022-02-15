

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestSuite {
	
	static ChromeDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		  
		  
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void TestCaseA() {
		System.out.println("Our first Test");
	}
	
	@Test
	public void TestCaseB() {
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void TestCaseC() {
		System.out.println("Our first Test");
	}
	
	@Test
	public void TestCaseD() {
		Assert.assertEquals(true, false);
	}

}
