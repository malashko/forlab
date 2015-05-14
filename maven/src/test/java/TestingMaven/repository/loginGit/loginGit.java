package TestingMaven.repository.loginGit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by FallOutBoy on 08.05.2015.
 */
public class loginGit {
    public static WebDriver driver = new FirefoxDriver();
    public static Logger log = Logger.getLogger("Firefox Driver");
    public static boolean login(){
        try {
            driver.get("https://github.com/");
            WebElement button = driver.findElement(By.linkText("Sign in"));
            button.click();
            WebElement signin = driver.findElement(By.name("login"));
            signin.sendKeys("malashko");
            signin = driver.findElement(By.name("password"));
            signin.sendKeys("malashko123");
            signin.submit();
            log.log(Level.INFO,"login success");
            return true;
        }
        catch (Exception e){
            log.log(Level.FATAL,e.getMessage());
            return false;
        }
    }
}
