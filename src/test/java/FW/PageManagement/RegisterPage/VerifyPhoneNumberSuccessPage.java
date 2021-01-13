package FW.PageManagement.RegisterPage;

import FW.PageManagement.AbstractPage.AbstractPage;

import static FW.CoreManagement.CoreManagement.getActionBrowser;
import static FW.CoreManagement.CoreManagement.getAssertionBrowser;
import static FW.PageManagement.PageFactory.getCommonPage;

public class VerifyPhoneNumberSuccessPage extends AbstractPage {

    private String continueButtonXpath = "//button//span[text()='Continue']";

    private String verifyPhoneNumberSuccessPageXpath = "//div[@class='aspire-cta-screen__content']";

    private String messageXpath = verifyPhoneNumberSuccessPageXpath + "/p";

    public VerifyPhoneNumberSuccessPage() {
    }

    public void waitForPageLoadCompleted() {
        this.waitForPageLoadCompletedByXpath(verifyPhoneNumberSuccessPageXpath);
    }

    public void verifyMessageDisplayedCorrectly(String message) {
        logger.info("I should see message: " + message + " displayed on Verify Phone Number Success Page");
        getAssertionBrowser().verifyElementDisplayedWithValue(messageXpath, message);
    }

    public void clickContinueButton() {
        logger.info("I click continue button on Verify Phone Number Success Page");
        getActionBrowser().clickElementByXpath(continueButtonXpath);
    }

}
