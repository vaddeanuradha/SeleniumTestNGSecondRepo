package SeleniumTestNGWithMaven.SeleniumTestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public void Testcase1() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.manage().window().maximize();		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Anuradha");
	}
}
