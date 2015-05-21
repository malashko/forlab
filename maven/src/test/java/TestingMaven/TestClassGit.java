package TestingMaven;

import TestingMaven.repository.initGit.initGit;
import TestingMaven.repository.loginGit.loginGit;
import TestingMaven.repository.createReposGit.createReposGit;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Jake on 13.03.2015.
 */
public class TestClassGit {

   @Test
    public void Setup(){
        Assert.assertTrue(initGit.init());
    }
    @BeforeMethod
    public void login(){
        Assert.assertTrue(loginGit.login());
    }
    @AfterMethod
    public void createRepos(){
        Assert.assertTrue(createReposGit.createRepos());
    }

}
