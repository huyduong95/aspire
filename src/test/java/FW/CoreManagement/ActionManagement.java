package FW.CoreManagement;

import org.openqa.selenium.WebDriver;

public class ActionManagement {

    private WebDriver actionManagementDriver;

    public ActionManagement(WebDriver driver) {
        actionManagementDriver = driver;
    }

    // Function
    public void navigateToPage(String pageUrl) {
        actionManagementDriver.get(pageUrl);
    }

    public void waitForPageLoadCompletedByXpath(String xpath) {

    }

    public void typeElementByXpath(String xpath, String value) {
        
    }
}
