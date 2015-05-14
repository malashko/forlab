package pageObject;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by FallOutBoy on 14.05.2015.
 */
public class loginPage {
    private WebDriver driver;
    public static Logger log = Logger.getLogger("Firefox Driver");
    /**
     * Вход
     */
    loginPage(WebDriver driver){
        this.driver = driver;
    }
    @FindBy(name = "login")
    private WebElement login;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(linkText = "Sign in")
    private WebElement sign;


    public void singGit() {

        PageFactory.initElements(driver, this);
    }

    public void signIn(){
        sign.click();
    }

    public void fill() {
        login.sendKeys("malashko");
        password.sendKeys("malashko123");
    }
    public boolean login(){
        try{
            login.submit();
            log.log(Level.INFO,"login success");
            return true;
        }
        catch (Exception e){
            log.log(Level.FATAL,e.getMessage());
            return false;
        }
    }

}
