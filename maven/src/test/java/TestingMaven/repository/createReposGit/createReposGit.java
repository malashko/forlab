package createReposGit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.security.x509.UniqueIdentity;

/**
 * Created by FallOutBoy on 08.05.2015.
 */
public class createReposGit {
    public static Logger log = Logger.getLogger("Firefox Driver");
    public static boolean createRepos(WebDriver driver){
        try {
            driver.findElement(By.className("tooltipped-s")).click();
            driver.findElement(By.linkText("New repository")).click();
            driver.findElement(By.id("repository_name")).sendKeys("malashko_rep"+ Math.random());
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
}
