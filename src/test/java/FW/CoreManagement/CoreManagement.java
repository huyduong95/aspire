package FW.CoreManagement;

import org.junit.*;

import static FW.PageManagement.PageFactory.*;

public class CoreManagement {

    private static DriverManagement driver;
    private static AssertionManagement assertionBrowser;
    private static ActionManagement actionBrowser;

    public CoreManagement() {
        driver = new DriverManagement();
        assertionBrowser = new AssertionManagement(driver.getDriver());
        actionBrowser = new ActionManagement(driver.getDriver());
    }

    public static void closeAllBrowser() {
        driver.killAllBrowser();
    }

    public static AssertionManagement getAssertionBrowser() {
        return assertionBrowser;
    }

    public static ActionManagement getActionBrowser() {
        return actionBrowser;
    }
}
