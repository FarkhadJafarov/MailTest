package test;

import Hooks.Hook;
import org.junit.Test;
import static constans.Constans.DataForLogin.*;
import static constans.Constans.Urls.MAİL_PAGE_URL;

public class SendMessageTest extends Hook {

    @Test
    public void SendMessage(){
        basePage.goToUrl(MAİL_PAGE_URL);
        mailLoginPage
                .setLoginInput(email)
                .clickWritePassButton()
                .setPassInput(pass)
                .clickLoginToMailBtn();
        mailInboxPage
                .clickWriteLetter()
                .enterToWhom(emailtoWhom)
                .enterSubjectMail(subjectMail)
                .enterBodyMail(bodyMail)
                .clickSendMessageBtn();
    }
}
