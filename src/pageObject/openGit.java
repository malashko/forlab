package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by FallOutBoy on 14.05.2015.
 */
public class openGit {
    private WebDriver driver = new FirefoxDriver();

    public loginPage open(String url) {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        return new loginPage(driver);
    }
}
