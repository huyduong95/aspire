package FW.CoreManagement;

import geb.waiting.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

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
        waitUntilElementDisplayed(xpath);
    }

    public boolean waitUntilElementDisplayed(String xpath) {
        try {
            WebDriverWait wait = new WebDriverWait(actionManagementDriver, 60);
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    try {
                        if (actionManagementDriver.findElement(By.xpath(xpath)).isDisplayed()) {
                            return true;
                        } else {
                            return false;
                        }
                    } catch (Exception e) {
                        return false;
                    }
                }
            });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean waitUntilElementDisplayed(String xpath, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(actionManagementDriver, timeOut);
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    try {
                        if (actionManagementDriver.findElement(By.xpath(xpath)).isDisplayed()) {
                            return true;
                        } else {
                            return false;
                        }
                    } catch (Exception e) {
                        return false;
                    }
                }
            });
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public boolean waitUntilElementNotDisplayed(String xpath) {
        try {
            WebDriverWait wait = new WebDriverWait(actionManagementDriver, 60);
            wait.until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    try {
                        if (actionManagementDriver.findElement(By.xpath(xpath)).isDisplayed()) {
                            return false;
                        } else {
                            return true;
                        }
                    } catch (Exception e) {
                        return true;
                    }
                }
            });
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void waitForElementClickable(String xpath) {
        WebDriverWait wait = new WebDriverWait(actionManagementDriver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    public void waitForElementVisible(String xpath) {
        try {
            WebDriverWait wait = new WebDriverWait(actionManagementDriver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        } catch (Exception ex) {

        }
    }

    public void browserSleep(int Seconds) {
        actionManagementDriver.manage().timeouts().implicitlyWait(Seconds, TimeUnit.SECONDS);
    }

    public void typeElementByXpath(String xpath, String value) {
        waitForElementVisible(xpath);
        WebElement ele = actionManagementDriver.findElement(By.xpath(xpath));
        ele.sendKeys(value);
    }

    public void sendKeyElementByXpath(String xpath, String value) {
        waitForElementVisible(xpath);
        Actions actions = new Actions(actionManagementDriver);
        WebElement ele = actionManagementDriver.findElement(By.xpath(xpath));
        actions.moveToElement(ele);
        actions.click();
        actions.sendKeys(value);
        actions.build().perform();
    }

    public void setValueByXpathUsingJS(String xpath, String value) {
        WebElement inputField = actionManagementDriver.findElement(By.xpath(xpath));
        JavascriptExecutor jse = (JavascriptExecutor)actionManagementDriver;
        jse.executeScript("arguments[0].setAttribute('value', '" + value +"')", inputField);
    }

    public void clickElementByXpath(String xpath) {
        waitForElementClickable(xpath);
        WebElement ele = actionManagementDriver.findElement(By.xpath(xpath));
        ele.click();
    }
}
