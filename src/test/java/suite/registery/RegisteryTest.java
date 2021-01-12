package suite.registery;

import FW.CoreManagement.CoreManagement;
import org.junit.*;
import org.testng.annotations.BeforeSuite;

import static FW.PageManagement.PageFactory.getCommonPage;
import static FW.PageManagement.PageFactory.getRegisterPhonePage;

public class RegisteryTest {

    private CoreManagement coreManagement;

    @Before
    public void setUpEnv() {
        coreManagement = new CoreManagement();
        getCommonPage().navigateToMainPage();
    }

    @After
    public void cleanUpEnv() {
        coreManagement.closeAllBrowser();
    }

    @Test
    public void registerAccountSuccessfully() {
        // Test Data
        String phoneNumber = "0123456789";

        // Step
        getRegisterPhonePage().typePhoneNumber(phoneNumber);
    }

    @Test
    public void registerAccountFailedAtTypeWrongPhoneOTP() {

    }
}