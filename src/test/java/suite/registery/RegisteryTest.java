package suite.registery;

import FW.CoreManagement.CoreManagement;
import org.junit.*;

import static FW.Common.CommonFunction.getRandomPhoneNumber;
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
        String phoneNumber = getRandomPhoneNumber();
        String fullName = "John Marlin";
        String emailAddress = String.format("john.marlin%s@marlin.com", getRandomPhoneNumber());
        String roleInCompany = "Appointed director";
        String hearAboutUsOption = "Facebook";
        String referralPromoCode = "1324";
        String successVerifyPhoneMessage = "You have successfully verified your phone number. You’re on to a great start!";
        String incorporatedOption = "Yes, my business is registered in Singapore with ACRA";
        String registrationType = "Standard Registration";
        String nationality = "Algeria";
        String gender = "Male";
        String[] products = {"Credit Line", "Debit Card"};
        String businessName = "Marlin Corp";
        String registrationTypeC = "Company (Public company, Pte Ltd, LLC)";
        String industry = "Retail Services";
        String subIndustry = "Accommodation & Hotels";

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

        // In-case Error Happens
//        if (getCommonPage().isAlertWarningDisplayed()) {
//            getRegisterPage().clickContinueButton();
//        }

        // Step Definition - Phone OTP Page
        getPhoneOTPPage().typeOTPCode();

        // Step Definition - Register Phone Success Page
        getVerifyPhoneNumberSuccessPage().verifyMessageDisplayedCorrectly(successVerifyPhoneMessage);
        getVerifyPhoneNumberSuccessPage().clickContinueButton();

        // Step Definition - Is your business incorporated in Singapore? Page
        getIncorporatedBusinessPage().clickContinueButtonOnOption(incorporatedOption);

        // Step Definition - Let’s know you better!
        getRegistrationSelectPage().clickContinueButtonOnOption(registrationType);

        // Step Definition - Personal Detail Form
        getPersonalDetailPage().clickGetStartedButton();
        getPersonalDetailPage().waitForPersonalDetailedPageLoadCompleted();
        getPersonalDetailPage().selectDateOnYearsAgo(1, 20);
        getPersonalDetailPage().selectNationality(nationality);
        getPersonalDetailPage().selectGender(gender);
        getPersonalDetailPage().selectProductInterested(products);
        getPersonalDetailPage().clickSubmitButton();

        // Step Definition - Email OTP Page
        getPhoneOTPPage().typeOTPCode();

        // Step Definition - Personal Detail - Business Detail Form
        getPersonalDetailPage().clickGetStartedButton();

        getPersonalDetailPage().typeBusinessName(businessName);
        getPersonalDetailPage().selectRegistrationType(registrationTypeC);
        getPersonalDetailPage().typeRandomRegistrationNumberUEN();
        getPersonalDetailPage().selectIndustry(industry);
        getPersonalDetailPage().selectSubIndustry(subIndustry);
        getPersonalDetailPage().clickSubmitButton();

        // Verify Identity - Can not verify due to lack of Test Data

    }

}