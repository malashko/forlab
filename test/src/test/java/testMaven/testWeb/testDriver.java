package testMaven.testWeb;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import sun.util.logging.PlatformLogger;

import java.util.concurrent.TimeUnit;


/**
 * Created by FallOutBoy on 06.03.2015.
 */
public class testDriver {
    public static WebDriver driver = new FirefoxDriver();
    public static Logger log = Logger.getLogger("Firefox Driver");
    public static boolean init(){
        try {
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           // log.log(Level.INFO, "initGit success");
            log.info("initGit success");
        }
        catch (Exception e) {
           // log.log(Level.FATAL, e.getMessage());
            log.fatal(e.getMessage());
            return false;
        }
        return true;
    }
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
    public static boolean createRepos(){
        try {
            driver.findElement(By.className("tooltipped-s")).click();
            driver.findElement(By.linkText("New repository")).click();
            driver.findElement(By.id("repository_name")).sendKeys("malashko_rep");
            WebElement description = driver.findElement(By.id("repository_description"));
            description.sendKeys("repos description");
            driver.findElement(By.id("repository_auto_init")).click();
            description.submit();
            log.log(Level.INFO,"create repository success");
            return true;
        }
        catch (Exception e){
            log.log(Level.FATAL,e.getMessage());
            return false;
        }
    }
   /* Logger log = Logger.getLogger("Firefox Driver");
    WebDriver driver = new FirefoxDriver();
    driver.get("https://github.com/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    WebElement button = driver.findElement(By.linkText("Sign in"));
    button.click();
    log.log(Level.INFO,"good");
    WebElement signin = driver.findElement(By.name("login"));
    signin.sendKeys("malashko");
    signin = driver.findElement(By.name("password"));
    signin.sendKeys("malashko123");
    signin.submit();
    driver.findElement(By.className("tooltipped-s")).click();
    driver.findElement(By.linkText("New repository")).click();
    driver.findElement(By.id("repository_name")).sendKeys("malashko_rep");
    WebElement description = driver.findElement(By.id("repository_description"));
    description.sendKeys("repos description");
    driver.findElement(By.id("repository_auto_init")).click();
    description.submit();*/
}
