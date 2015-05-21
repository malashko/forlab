package initGit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by FallOutBoy on 08.05.2015.
 */
public class initGit {
    public static Logger log = Logger.getLogger("Firefox Driver");
    public static boolean init(WebDriver driver){
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
}
