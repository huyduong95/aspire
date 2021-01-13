package FW.CoreManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
        String testingOS = getDataFromConfig("OS");
        String currentDir = System.getProperty("user.dir");
        WebDriver newDriver = null;
        if (testingBrowser.equalsIgnoreCase("Chrome")) {
            if(testingOS.equalsIgnoreCase("Windows")) {
                System.setProperty("webdriver.chrome.driver", currentDir + "/src/test/resources/webDriver/Chrome/chromedriverWin.exe");
            } else if(testingOS.equalsIgnoreCase("Mac OS")) {
                System.setProperty("webdriver.chrome.driver", currentDir + "/src/test/resources/webDriver/Chrome/chromedriverMac");
            }
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            newDriver = new ChromeDriver(options);
        }
        setDriver(newDriver);
    }

    public void killAllBrowser() {
        getDriver().quit();
    }

}
