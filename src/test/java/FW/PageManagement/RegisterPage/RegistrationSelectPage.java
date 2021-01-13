package FW.PageManagement.RegisterPage;

import FW.PageManagement.AbstractPage.AbstractPage;

import static FW.CoreManagement.CoreManagement.getActionBrowser;

public class RegistrationSelectPage extends AbstractPage {

    private String registrationSelectPageXpath = "//main[contains(@class,'q-page')]";
    private String optionOfRegistrationXpath = registrationSelectPageXpath + "//span[@class='onboarding-step-register-select-method__column-content--title'][normalize-space(text())='%s']/ancestor::div[@class='onboarding-step-register-select-method__column-content']//button";

    public RegistrationSelectPage() {
    }

    public void waitForPageLoadCompleted() {
        this.waitForPageLoadCompletedByXpath(registrationSelectPageXpath);
    }

    public void clickContinueButtonOnOption(String option) {
        logger.info("I click continue button on option: " + option + "");
        String xpath = String.format(optionOfRegistrationXpath, option);
        getActionBrowser().clickElementByXpath(xpath);
    }
}
