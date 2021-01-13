package FW.PageManagement.RegisterPage;

import FW.PageManagement.AbstractPage.AbstractPage;

import static FW.PageManagement.PageFactory.*;

public class PhoneOTPPage extends AbstractPage {

    private String otpPageXpath = "//form[contains(@class,'q-form')]//div[contains(@class,'digit-input__input')]";

    public PhoneOTPPage() {
        waitForPageLoadCompleted();
    }

    public void waitForPageLoadCompleted() {
        this.waitForPageLoadCompletedByXpath(otpPageXpath);
    }

    public void typeOTPCode() {
        getCommonPage().waitForLoadingPageDisappeared();
        OTPPage otpPage = new OTPPage();
        otpPage.typeOTP();
    }

}
