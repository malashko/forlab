package testGit;

import org.testng.Assert;
import org.testng.annotations.*;
import testWeb.testDriver;

/**
 * Created by FallOutBoy on 17.04.2015.
 */
public class testGit {
    @Test
    public void Setup(){
        Assert.assertTrue(testDriver.init());
    }
    @Test
    public void login(){
        Assert.assertTrue(testDriver.login());
    }
    @Test
    public void createRepos(){
        Assert.assertTrue(testDriver.createRepos());
    }

}
