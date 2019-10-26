package week5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverDefenition 
{
    public static WebDriver driver = null;
    
    
    public WebdriverDefenition()
    {
        if(driver == null)
        {
                  //Mention path of chrome driver of your system
              String exePath = "C:\\ProgramData\\Chrome_driver_76.0.3809.68\\Chromedriver.exe";
              System.setProperty("webdriver.chrome.driver", exePath);
              driver = new ChromeDriver();
              System.out.println("**Chrome driver initiated**");
        }
        else
        {
            System.out.println("**Chrome driver already instantiated**");
        }
    }
    
    public static WebDriver getdriver()
    {
        if (driver == null){
            return driver;
            }else{
            return driver;
            }
    }
}


