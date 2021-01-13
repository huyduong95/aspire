package FW.PageManagement.RegisterPage;

import FW.PageManagement.AbstractPage.AbstractPage;

import static FW.CoreManagement.CoreManagement.getActionBrowser;

public class IncorporatedBusinessPage extends AbstractPage {

    private String incorporatedBusinessPageXpath = "//main[contains(@class,'q-page')]";
    private String optionOfIncorporatedBusinessXpath = incorporatedBusinessPageXpath + "//span[@class='incorporated_selector__column-content--title'][normalize-space(text())='%s']/ancestor::div[@class='incorporated_selector__column-content']//button";

    public IncorporatedBusinessPage() {
    }

    public void waitForPageLoadCompleted() {
        this.waitForPageLoadCompletedByXpath(incorporatedBusinessPageXpath);
    }

    public void clickContinueButtonOnOption(String option) {
        logger.info("I click continue button on option: " + option + "");
        String xpath = String.format(optionOfIncorporatedBusinessXpath, option);
        getActionBrowser().clickElementByXpath(xpath);
    }
}
