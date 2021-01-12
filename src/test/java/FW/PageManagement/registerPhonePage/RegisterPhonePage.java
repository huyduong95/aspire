package FW.PageManagement.registerPhonePage;

import FW.PageManagement.AbstractPage.AbstractPage;

import java.util.logging.Logger;

import static FW.CoreManagement.CoreManagement.getActionBrowser;

public class RegisterPhonePage extends AbstractPage {

    private String registerPhonePageXpath = "";

    public RegisterPhonePage() {
        waitForPageLoadCompleted();
    }

    public void waitForPageLoadCompleted() {
        this.waitForPageLoadCompletedByXpath(registerPhonePageXpath);
    }

    public void typePhoneNumber(String phoneNumber) {
        logger.info(String.format("I type %s into Phone field", phoneNumber));
        getActionBrowser().typeElementByXpath("", phoneNumber);
    }

}
