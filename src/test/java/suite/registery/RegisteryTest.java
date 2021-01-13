package suite.registery;

import FW.CoreManagement.CoreManagement;
import org.junit.*;
import org.testng.annotations.BeforeSuite;

import static FW.Common.CommonFunction.randomPhoneNumber;
import static FW.PageManagement.PageFactory.*;

public class RegisteryTest {

    private CoreManagement coreManagement;

    @Before
    public void setUpEnv() {
        coreManagement = new CoreManagement();
        getCommonPage().navigateToMainPage();
    }

    @After
    public void cleanUpEnv() {
//        coreManagement.closeAllBrowser();
    }

    @Test
    public void registerAccountSuccessfully() {
        // Test Data
        String phoneNumber = randomPhoneNumber();
        String fullName = "John Marlin";
        String emailAddress = String.format("john.marlin%s@marlin.com", randomPhoneNumber());
        String roleInCompany = "Appointed director";
        String hearAboutUsOption = "Facebook";
        String referralPromoCode = "1324";
        String successVerifyPhoneMessage = "You have successfully verified your phone number. You’re on to a great start!";
        String incorporatedOption = "Yes, my business is registered in Singapore with ACRA";
        String registrationType = "Standard Registration";

        // Step Definition - Login Page
        getLoginPage().clickOnRegisterLink();

        // Step Definition - Register Page
        getRegisterPage().typeFullName(fullName);
        getRegisterPage().typeEmailAddress(emailAddress);
        getRegisterPage().typePhoneNumber(phoneNumber);
        getRegisterPage().selectRoleInCompany(roleInCompany);
        getRegisterPage().selectHearAboutUsOption(hearAboutUsOption);
        getRegisterPage().typeReferralPromoCode(referralPromoCode);
        getRegisterPage().clickAgreeTerms();
        getRegisterPage().clickContinueButton();

        // Step Definition - Phone OTP Page
        getPhoneOTPPage().typeOTPCode();

        // Step Definition - Register Phone Success Page
        getVerifyPhoneNumberSuccessPage().verifyMessageDisplayedCorrectly(successVerifyPhoneMessage);
        getVerifyPhoneNumberSuccessPage().clickContinueButton();

        // Step Definition - Is your business incorporated in Singapore? Page
        getIncorporatedBusinessPage().clickContinueButtonOnOption(incorporatedOption);

        // Step Definition - Let’s know you better!
        getRegistrationSelectPage().clickContinueButtonOnOption(registrationType);
    }

    @Test
    public void registerAccountFailedAtTypeWrongPhoneOTP() {

    }
}