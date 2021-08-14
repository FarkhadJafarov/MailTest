package Hooks;

import PageObject.MailInboxPage;
import PageObject.MailLoginPage;
import base.BasePage;
import common.CommonActions;
import org.junit.After;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Hook {

    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MailLoginPage mailLoginPage = new MailLoginPage(driver);
    protected MailInboxPage mailInboxPage = new MailInboxPage(driver);

    @After
    public void close(){
        driver.close();
    }
}
