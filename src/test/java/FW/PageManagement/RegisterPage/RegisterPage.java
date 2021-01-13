package FW.PageManagement.RegisterPage;

import FW.PageManagement.AbstractPage.AbstractPage;

import static FW.CoreManagement.CoreManagement.getActionBrowser;
import static FW.PageManagement.PageFactory.getCommonPage;
import static FW.PageManagement.PageFactory.getRegisterPage;

public class RegisterPage extends AbstractPage {

    private String registerPageXpath = "//form[@class='q-form auth-form']//div[@class='q-img__content absolute-full']";
    private String registerFormXpath = "//form[@class='q-form auth-form']";
    private String fullNameFieldXpath = registerFormXpath + "//input[@data-cy='register-person-name']";
    private String emailFieldXpath = registerFormXpath + "//input[@data-cy='register-person-email']";
    private String phoneNumberFieldXpath = registerFormXpath + "//input[@data-cy='register-person-phone']";
    private String roleInCompanyFieldXpath = registerFormXpath + "//div[contains(@class,'q-radio__label')][text()='%s']";
    private String hearAboutUsFieldXpath = registerFormXpath + "//input[@data-cy='register-person-heard-about']";
    private String hearAboutUsDropdownXpath = "//div[@class='q-virtual-scroll__content']";
    private String hearAboutUsOptionXpath = "//div[@class='q-virtual-scroll__content']//div[@class='q-item__label'][text()='%s']";
    private String referralPromoCodeXpath = registerFormXpath + "//input[@data-cy='register-person-referral-code']";
    private String agreeTermsCheckboxXpath = registerFormXpath + "//div[@data-cy='register-person-privacy']";
    private String continueButtonXpath = "//button//span[text()='Continue']";

    public RegisterPage() {
    }

    public void waitForPageLoadCompleted() {
        this.waitForPageLoadCompletedByXpath(registerPageXpath);
    }

    public void typeFullName(String fullName) {
        logger.info("I type: " + fullName + " into Full Name field");
        getActionBrowser().typeElementByXpath(fullNameFieldXpath, fullName);
    }

    public void typeEmailAddress(String emailAddress) {
        logger.info("I type: " + emailAddress + " into Email Address field");
        getActionBrowser().typeElementByXpath(emailFieldXpath, emailAddress);
    }

    public void typePhoneNumber(String phoneNumber) {
        logger.info("I type: " + phoneNumber + " into Phone Number field");
        getActionBrowser().typeElementByXpath(phoneNumberFieldXpath, phoneNumber);
    }

    public void selectRoleInCompany(String roleInCompany) {
        logger.info("I select: " + roleInCompany + " in Select your role in the company field");
        String xpath = String.format(roleInCompanyFieldXpath, roleInCompany);
        getActionBrowser().clickElementByXpath(xpath);
    }

    public void clickInHearAboutUsField() {
        logger.info("I click in Where did you hear about us? field");
        getActionBrowser().clickElementByXpath(hearAboutUsFieldXpath);
        getActionBrowser().waitForElementVisible(hearAboutUsDropdownXpath);
    }

    public void selectHearAboutUsOption(String option) {
        clickInHearAboutUsField();
        logger.info("I select option: " + option + " in Where You hear about us? dropdown");
        String xpath = String.format(hearAboutUsOptionXpath, option);
        getActionBrowser().clickElementByXpath(xpath);
    }

    public void typeReferralPromoCode(String referralPromoCode) {
        logger.info("I type: " + referralPromoCode + " into Referral/promo code field");
        getActionBrowser().typeElementByXpath(referralPromoCodeXpath, referralPromoCode);
    }

    public void clickAgreeTerms() {
        logger.info("I click I have read and agree with the Terms and Conditions and Privacy Policy checkbox");
        getActionBrowser().clickElementByXpath(agreeTermsCheckboxXpath);
    }

    public void clickContinueButton() {
        logger.info("I click continue button");
        getActionBrowser().clickElementByXpath(continueButtonXpath);
    }


}
