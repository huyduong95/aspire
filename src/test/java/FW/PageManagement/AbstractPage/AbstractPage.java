package FW.PageManagement.AbstractPage;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import static FW.CoreManagement.CoreManagement.getActionBrowser;

public class AbstractPage {

    protected Logger logger;

    public AbstractPage() {
        logger = Logger.getLogger(this.getClass().getSimpleName());
        BasicConfigurator.configure();
    }

    protected void waitForPageLoadCompletedByXpath(String xpath) {
        getActionBrowser().waitForPageLoadCompletedByXpath(xpath);
    }

}
