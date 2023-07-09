package SeleniumTestNGWithMaven.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 {
	public WebDriver driver = null;
	String baseUrl = "https://www.google.com/";
	
	@BeforeMethod(groups= {"functionalTest"})
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver(); 
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	@Test
	public void clickGoogleAPP() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).click();
		Thread.sleep(6000);
		WebElement webEle = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[3]/iframe"));
		Thread.sleep(4000);
		WebDriver frameDriver = driver.switchTo().frame(webEle);
		Thread.sleep(17000);
		frameDriver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div > c-wiz > div > div > div.v7bWUd > div.o83JEf > div:nth-child(1) > ul > li:nth-child(5) > a")).click();
	}
	@Test(groups= {"functionalTest"})
	public void launchAmazonBrowser() {
		driver.get("https://www.amazon.com/");
		driver.findElement(By.linkText("Best Sellers")).click();
	}
   @AfterMethod
   public void closeBrowser() {
	   driver.close();
   }
}
