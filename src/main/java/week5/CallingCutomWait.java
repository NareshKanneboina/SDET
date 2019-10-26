package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingCutomWait {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CutomWait CW = new CutomWait();
		
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  //driver.findElement(By.cssSelector("[name=txtUsername]")).sendKeys("admin");
		  //CW.isElementPresnt(driver, ".//*[@name='txtUsername'", 20).sendKeys("Admin");
		CW.isElementPresnt(driver, "[name=txtUsername]", 20).sendKeys("Admin");

	}

}
