package FW.PageManagement.CommonPage;

import FW.PageManagement.AbstractPage.AbstractPage;
import org.apache.log4j.BasicConfigurator;

import java.util.logging.Logger;

import static FW.Common.CommonFunction.getDataFromConfig;
import static FW.CoreManagement.CoreManagement.*;
import static FW.PageManagement.PageFactory.getRegisterPhonePage;

public class CommonPage extends AbstractPage {


    public CommonPage() {
    }

    public void navigateToMainPage() {
        String pageUrl = getDataFromConfig("BASE_URL");
        getActionBrowser().navigateToPage(pageUrl);
        getRegisterPhonePage().waitForPageLoadCompleted();
        logger.info("==================== Test ====================");
    }
}
