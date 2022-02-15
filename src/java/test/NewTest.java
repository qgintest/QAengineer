import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	public WebDriver driver;
	
	@Test
	public void test1() {
		System.out.println("Test");
	}
	
	@Test
	public void test2() {
		System.out.println("Test");

	}

	@BeforeClass
	public void beforeClass() {
		
		WebDriverManager.chromedriver().setup();
		
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        driver.quit();
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}



}
