package testMaven.testGit;

import org.testng.Assert;
import org.testng.annotations.*;
import testWeb.testDriver;

/**
 * Created by FallOutBoy on 17.04.2015.
 */
public class testGit {
    @BeforeTest
    public void Setup(){
        Assert.assertEquals(true, testDriver.init());
    }
    @Test
    public void login(){
        Assert.assertEquals(true, testDriver.login());
    }
    @AfterTest
    public void createRepos(){
        Assert.assertEquals(true,testDriver.createRepos());
    }

}
