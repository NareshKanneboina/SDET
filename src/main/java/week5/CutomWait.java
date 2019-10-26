package week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CutomWait {
    
    
	public static WebElement isElementPresnt(WebDriver driver,String xpath,int time)
    {
        WebElement ele = null;
        
        for(int i=0;i<time;i++)
        {
            try{
                System.out.println("***Inside custom wait***");
                ele=driver.findElement(By.xpath(xpath));
            break;
        }
        catch(Exception e)
        {
        try 
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e1) 
        {
            System.out.println("Waiting for element to appear on DOM");
        }
        }
            //1- Customize Customwait class and make it compatible for Css, Xpath, Id, Name etc)
    }
    return ele;
    
    }
}
