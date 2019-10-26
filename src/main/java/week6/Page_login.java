package week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_login {
    
//  WebDriver driver = null;

    By userName = By.cssSelector("[name='txtUsername']");

    By userPassword = By.cssSelector("[name='txtPassword']");

    By login = By.cssSelector("[value='LOGIN']");

    

    //Set user name in textbox

    public void setUserName(WebDriver driver, String strUserName){

        driver.findElement(userName).sendKeys(strUserName);

    }

    //Set password in password textbox

    public void setPassword(WebDriver driver, String strPassword){

         driver.findElement(userPassword).sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(WebDriver driver ){

            driver.findElement(login).click();

    }

    

    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public WebDriver loginToOrangeHRM(WebDriver driver, String strUserName,String strPasword){

        //Fill user name

        this.setUserName(driver, strUserName);

        //Fill password

        this.setPassword(driver, strPasword);

        //Click Login button

        this.clickLogin(driver); 
        
        return driver;
    }
    

    public WebDriver forgetPassword(WebDriver driver, String strUserName,String strPasword){

        //Forgot
        //clickon forgot password
        //enter username
        //Reset Password
        
        return driver;
    }

}
