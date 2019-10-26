package week5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TextEx extends WebdriverDefenition {

		@Test(priority=1)
	    public void login_OrangeHRM()
	    {       
	        getdriver().get("https://en.wikipedia.org/wiki/Login");
	        getdriver().findElement(By.xpath("//*[@name='search']")).sendKeys("Test Automation");
	        getdriver().findElement(By.xpath("//*[@name='go']")).click(); 
	    }
	    
	    @Test(priority=2)
	    public void loginWiki_GetTitle()
	    {
	        String Title;
	        Title = getdriver().findElement(By.xpath("//*[@id='firstHeading']")).getText();
	        Assert.assertEquals(Title, "Test Automation");
	        System.out.print("Title--"+Title);      
	        
	    }
	    
	    @Test
	    public void gethyperlinks()
	    {
	    List<WebElement> el = driver.findElements(By.tagName("a"));
	    for (int i = 0 ; i< el.size(); i++)
        {
          System.out.println("---Link " + i + " = " + el.get(i));
        }
	    for(WebElement e:el)
	    {
	    	System.out.println("---LinkName-- " + e.getText());
	    }
	    }
	}
