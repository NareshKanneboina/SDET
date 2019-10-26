package week6;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Call_Loginpage {
  @Test
  public void f() {
  }
  
  @BeforeSuite
  public void beforeSuite() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.get("https://cirrus-master.optum.com/");
		//driver.findElement(By.name("userID")).sendKeys("hhampi");
		//driver.findElement(By.name("password")).sendKeys("Sep032018");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		/*  driver.findElement(By.cssSelector("[name=txtUsername]")).sendKeys("admin");
		  driver.findElement(By.cssSelector("[name=txtPassword]")).sendKeys("admin123");
		  driver.findElement(By.cssSelector("[name=Submit]")).click();*/
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  loginToOrangeHRM page = new loginToOrangeHRM("driver", "admin", "admin123");
  }
  
  

}
