package FW.PageManagement;

import FW.PageManagement.CommonPage.CommonPage;
import FW.PageManagement.CommonPage.DatePicker;
import FW.PageManagement.LoginPage.LoginPage;
import FW.PageManagement.RegisterPage.*;

public class PageFactory {

    private static LoginPage loginPage;
    private static RegisterPage registerPage;
    private static CommonPage commonPage;
    private static PhoneOTPPage phoneOTPPage;
    private static VerifyPhoneNumberSuccessPage verifyPhoneNumberSuccessPage;
    private static IncorporatedBusinessPage incorporatedBusinessPage;
    private static RegistrationSelectPage registrationSelectPage;
    private static PersonalDetailPage personalDetailPage;
    private static DatePicker datePicker;

    public static LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        } else {
            loginPage.waitForPageLoadCompleted();
        }
        return loginPage;
    }

    public static RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage();
        } else {
            registerPage.waitForPageLoadCompleted();
        }
        return registerPage;
    }

    public static PhoneOTPPage getPhoneOTPPage() {
        if (phoneOTPPage == null) {
            phoneOTPPage = new PhoneOTPPage();
        } else {
            phoneOTPPage.waitForPageLoadCompleted();
        }
        return phoneOTPPage;
    }

    public static VerifyPhoneNumberSuccessPage getVerifyPhoneNumberSuccessPage() {
        if (verifyPhoneNumberSuccessPage == null) {
            verifyPhoneNumberSuccessPage = new VerifyPhoneNumberSuccessPage();
        } else {
            verifyPhoneNumberSuccessPage.waitForPageLoadCompleted();
        }
        return verifyPhoneNumberSuccessPage;
    }

    public static IncorporatedBusinessPage getIncorporatedBusinessPage() {
        if (incorporatedBusinessPage == null) {
            incorporatedBusinessPage = new IncorporatedBusinessPage();
        } else {
            incorporatedBusinessPage.waitForPageLoadCompleted();
        }
        return incorporatedBusinessPage;
    }

    public static RegistrationSelectPage getRegistrationSelectPage() {
        if (registrationSelectPage == null) {
            registrationSelectPage = new RegistrationSelectPage();
        } else {
            registrationSelectPage.waitForPageLoadCompleted();
        }
        return registrationSelectPage;
    }

    public static CommonPage getCommonPage() {
        if (commonPage == null) {
            commonPage = new CommonPage();
        }
        return commonPage;
    }

    public static PersonalDetailPage getPersonalDetailPage() {
        if (personalDetailPage == null) {
            PageFactory.personalDetailPage = new PersonalDetailPage();
        } else {
            PageFactory.personalDetailPage.waitForPageLoadCompleted();
        }
        return PageFactory.personalDetailPage;
    }

    public static DatePicker getDatePicker() {
        if (datePicker == null) {
            datePicker = new DatePicker();
        } else {
            datePicker.waitForPageLoadCompleted();
        }
        return datePicker;
    }

}
