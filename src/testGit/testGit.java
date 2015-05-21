package testGit;

import org.testng.Assert;
import org.testng.annotations.*;
import testWeb.testDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by FallOutBoy on 17.04.2015.
 */
public class testGit {
	WebDriver driver = new FirefoxDriver();
    @Test
    public void Setup(){
        Assert.assertTrue(testDriver.init(driver));
    }
    @BeforeMethod
    public void login(){
        Assert.assertTrue(testDriver.login(driver));
    }
    @AfterMethod
    public void createRepos(){
        Assert.assertTrue(testDriver.createRepos(driver));
    }

}
