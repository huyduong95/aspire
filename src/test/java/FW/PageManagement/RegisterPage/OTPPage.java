package FW.PageManagement.RegisterPage;

import FW.PageManagement.AbstractPage.AbstractPage;

import static FW.CoreManagement.CoreManagement.getActionBrowser;
import static FW.OTPManagement.OTPManagement.generateOTP;

public class OTPPage extends AbstractPage {

    private String otpFieldXpath = "//div[contains(@class,'digit-input__input') and contains(@class,'digit-input__input--highlight')]";

    public void typeOTP() {
        String otpCode = generateOTP();
        logger.info("I type OTP code: " + otpCode + " into OTP field");
        for (char otp : otpCode.toCharArray()) {
            getActionBrowser().clickElementByXpath(otpFieldXpath);
            getActionBrowser().sendKeyElementByXpath(otpFieldXpath, String.valueOf(otp));
        }
    }

}
