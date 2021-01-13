package FW.CoreManagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AssertionManagement extends ActionManagement {

    private WebDriver assertionManagementDriver;

    public AssertionManagement(WebDriver driver) {
        super(driver);
        assertionManagementDriver = driver;
    }

    // Function
    public void verifyElementDisplayed() {

    }

    public void verifyElementDisplayedWithValue(String xpath, String value) {
        waitForElementVisible(xpath);
        WebElement ele = assertionManagementDriver.findElement(By.xpath(xpath));
        Assert.assertEquals(ele.getText().trim(), value);
    }
}
