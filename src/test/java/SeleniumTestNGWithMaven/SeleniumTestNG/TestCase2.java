package SeleniumTestNGWithMaven.SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {
	public WebDriver driver;	 
	@BeforeMethod
  public void launchBrowser() throws InterruptedException  {
	 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
     String baseUrl = "https://www.amazon.com";
	 driver = new ChromeDriver();       
     driver.navigate().to(baseUrl);
     driver.manage().window().maximize();	 
  }
  @Test(priority=0)
  public void clickBestsellers() {
	  System.out.println("this is priority 0 ");
	  driver.findElement(By.linkText("Best Sellers")).click();
  }
  @Test(priority=2)
  public void clickNewReleases() {
	  System.out.println("this is priority 2 ");
	  driver.findElement(By.linkText("New Releases")).click();
  }
  @Test(priority=1)
  public void pageTitleCompare()
  {
	  System.out.println("this is priority 1 ");
	  String expectedTitle ="Amazon.com. Spend less. Smile more.";
	  String actualTitle = driver.getTitle();
	  System.out.println(actualTitle);
      Assert.assertEquals(actualTitle, expectedTitle);
  }
  @Test(priority=3)
  public void navigateBack()
  {
	  System.out.println("this is priority 3 ");
	  driver.navigate().back();
	  driver.navigate().forward();
  }
  @AfterMethod
  public void closeBrowser()
  {
	  driver.close();
  }
}
