package FW.CoreManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static FW.Common.CommonFunction.getDataFromConfig;

public class DriverManagement {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public DriverManagement() {
        initializeBrowser();
    }

    // Function
    public void initializeBrowser() {
        String testingBrowser = getDataFromConfig("BROWSER");
        if (testingBrowser.equalsIgnoreCase("Chrome")) {
            String currentDir = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", currentDir + "/src/test/resources/webDriver/chromedriver.exe");
            WebDriver newDriver = new ChromeDriver();
            setDriver(newDriver);
        }
    }

    public void killAllBrowser() {
        getDriver().quit();
    }

}
