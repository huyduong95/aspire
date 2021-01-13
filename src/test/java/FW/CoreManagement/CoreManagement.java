package FW.CoreManagement;

import org.junit.*;

import static FW.PageManagement.PageFactory.*;

public class CoreManagement {

    private static DriverManagement driverManagement;
    private static AssertionManagement assertionBrowser;
    private static ActionManagement actionBrowser;

    public CoreManagement() {
        driverManagement = new DriverManagement();
        assertionBrowser = new AssertionManagement(driverManagement.getDriver());
        actionBrowser = new ActionManagement(driverManagement.getDriver());
    }

    public static void closeAllBrowser() {
        driverManagement.killAllBrowser();
    }

    public static AssertionManagement getAssertionBrowser() {
        return assertionBrowser;
    }

    public static ActionManagement getActionBrowser() {
        return actionBrowser;
    }
}
