package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CommonActions {
    public static WebDriver createDriver(){
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","C:/Users/farhad.cafarov/IdeaProjects/MailProject/src/main/resources/GeckoDriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette",true);
        driver= new FirefoxDriver(capabilities);
        driver.manage().window().maximize();
        return driver;
    }
}
