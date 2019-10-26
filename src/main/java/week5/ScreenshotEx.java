package week5;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class ScreenshotEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exePath = "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);             
        WebDriver driver = new ChromeDriver();
        driver.get("http://news.google.com");
        driver.manage().window().maximize();
        Shutterbug.shootPage(driver,ScrollStrategy.WHOLE_PAGE).withName("FullCapture").save("./Screenshot");
        //driver.quit();  
        /*File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
         // now copy the  screenshot to desired location using copyFile //method
        FileUtils.copyFile(src, new File("./Screenshot/Error.png"));
        }
         
        catch (IOException e)
         {
          System.out.println(e.getMessage());*/
         
         }     
                




	}

//}
