package PageObject;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailLoginPage extends BasePage {

    public MailLoginPage(WebDriver driver){
        super(driver);
    }

    private final By loginInput = By.xpath("//*[@data-testid='login-input']");
    private final By writePassBtn = By.xpath("//*[@data-testid='enter-password']");
    private final By passInput = By.xpath("//*[@data-testid='password-input']");
    private final By loginToMailBtn = By.xpath("//*[@data-testid='login-to-mail']");


    public MailLoginPage setLoginInput(String email) {
        driver.findElement(loginInput).sendKeys(email);
        return this;
    }

    public MailLoginPage clickWritePassButton(){
        driver.findElement(writePassBtn).click();
        return this;
    }

    public MailLoginPage setPassInput(String pass){
        waitElementIsVisible(passInput);
        driver.findElement(passInput).sendKeys(pass);
        return this;
    }

    public MailLoginPage clickLoginToMailBtn(){
        waitElementIsVisible(loginToMailBtn);
        driver.findElement(loginToMailBtn).click();
        return this;
    }
}
