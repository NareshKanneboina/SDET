package week5;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CirrusMemberNavigation {
	
	WebDriver driver;
 
	@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
	  //driver.findElement(By.cssSelector("[name=userID]")).sendKeys("nk16");
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  String exePath = "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe";
      System.setProperty("webdriver.chrome.driver", exePath);
      driver = new ChromeDriver();
      System.out.println("**Chrome driver initiated**");
      
      driver.get("https://cirrus-quiz.optum.com/");
      driver.findElement(By.cssSelector("[name=userID]")).sendKeys("nk16");
      driver.findElement(By.cssSelector("[name=password]")).sendKeys("Potti@143");
      driver.findElement(By.cssSelector("[name='action']")).click();
  }

  @AfterSuite
  public void afterSuite() {
  }

}
