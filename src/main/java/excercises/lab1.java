package excercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//driver.get("https://cirrus-master.optum.com/");
		//driver.findElement(By.name("userID")).sendKeys("hhampi");
		//driver.findElement(By.name("password")).sendKeys("Sep032018");
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		  driver.findElement(By.cssSelector("[name=txtUsername]")).sendKeys("admin");
		  driver.findElement(By.cssSelector("[name=txtPassword]")).sendKeys("admin123");
		  driver.findElement(By.cssSelector("[name=Submit]")).click();
	}

}
