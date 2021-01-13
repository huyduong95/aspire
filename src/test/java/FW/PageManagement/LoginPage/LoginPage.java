package FW.PageManagement.LoginPage;

import FW.PageManagement.AbstractPage.AbstractPage;

import static FW.CoreManagement.CoreManagement.getActionBrowser;

public class LoginPage extends AbstractPage {

    private String loginPageXPath = "//div[@class='auth-form__card']//div[@class='q-img__content absolute-full']";
    private String loginFormXpath = "//div[@class='auth-form__card']";
    private String registerPhoneFlagXpath = loginFormXpath + "//div[@class='q-img__content absolute-full']";
    private String registerPhoneInputXpath = loginFormXpath + "//input[@data-cy='register-person-phone']";
    private String registerLinkXpath = "//a[contains(@class,'login-step-start__register-link')]";


    public LoginPage() {
        waitForPageLoadCompleted();
    }

    public void waitForPageLoadCompleted() {
        this.waitForPageLoadCompletedByXpath(loginPageXPath);
    }

    public void typePhoneNumber(String phoneNumber) {
        logger.info(String.format("I type %s into Phone field", phoneNumber));
        getActionBrowser().typeElementByXpath(registerPhoneInputXpath, phoneNumber);
    }

    public void clickOnRegisterLink() {
        logger.info("I click on register link");
        getActionBrowser().clickElementByXpath(registerLinkXpath);
    }

}
