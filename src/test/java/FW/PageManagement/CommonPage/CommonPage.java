package FW.PageManagement.CommonPage;

import FW.PageManagement.AbstractPage.AbstractPage;
import org.apache.log4j.BasicConfigurator;

import java.util.logging.Logger;

import static FW.Common.CommonFunction.getDataFromConfig;
import static FW.CoreManagement.CoreManagement.*;
import static FW.CoreManagement.CoreManagement.getActionBrowser;
import static FW.PageManagement.PageFactory.*;

public class CommonPage extends AbstractPage {

    private String loadingPageXpath = "//div[contains(@class,'q-inner-loading') and @showing='true']";


    public CommonPage() {
    }

    public void navigateToMainPage() {
        String pageUrl = getDataFromConfig("BASE_URL");
        getActionBrowser().navigateToPage(pageUrl);
        getLoginPage().waitForPageLoadCompleted();
        logger.info("==================== Test ====================");
    }

    public void waitForLoadingPageDisappeared() {
        getActionBrowser().waitForElementVisible(loadingPageXpath);
        getActionBrowser().waitUntilElementNotDisplayed(loadingPageXpath);
    }
}
