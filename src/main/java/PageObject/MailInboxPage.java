package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailInboxPage extends MailLoginPage{

    public MailInboxPage(WebDriver driver) {
      super(driver);
    }

    private final By writeLetterBtn = By.xpath("//*[@class='compose-button__wrapper']");
    private final By toWhom = By.xpath("//input[@tabindex='100']");
    private final By bodyMail = By.xpath("//*[@tabindex='505']");
    private final By subjectMail = By.xpath("//*[@tabindex='400']");
    private final By sendMessageBtn = By.xpath("//*[@tabindex='570']");

    public MailInboxPage  clickWriteLetter(){
        waitElementIsVisible(writeLetterBtn);
        driver.findElement(writeLetterBtn).click();
        return this;
    }

    public MailInboxPage enterToWhom(String mailToWhom){
        waitElementIsVisible(toWhom);
        driver.findElement(toWhom).sendKeys(mailToWhom);
        return this;
    }

    public MailInboxPage enterSubjectMail(String enterSubject){
        waitElementIsVisible(subjectMail);
        driver.findElement(subjectMail).sendKeys(enterSubject);
        return this;
    }

    public MailInboxPage enterBodyMail(String enterBody){
        waitElementIsVisible(subjectMail);
        driver.findElement(bodyMail).sendKeys(enterBody);
        return this;
    }

    public MailInboxPage clickSendMessageBtn(){
        waitElementIsVisible(sendMessageBtn);
        driver.findElement(sendMessageBtn).click();
        return this;
    }
}
