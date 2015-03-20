package testWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by FallOutBoy on 06.03.2015.
 */
public class testDriver {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement button = driver.findElement(By.linkText("Sign in"));
        button.click();
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
        description.submit();
    }

}
