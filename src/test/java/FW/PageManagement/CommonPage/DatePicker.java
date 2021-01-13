package FW.PageManagement.CommonPage;

import FW.PageManagement.AbstractPage.AbstractPage;

import static FW.CoreManagement.CoreManagement.getActionBrowser;

public class DatePicker extends AbstractPage {

    private String datePickerXpath = "//div[contains(@class,'q-date--portrai')]";
    private String backIconMonthXpath = "(//div[contains(@class,'q-date--portrai')]//div[contains(@class,'q-date__arrow')]//i[contains(@class,'left')])[1]";
    private String nextIconMonthXpath = "(//div[contains(@class,'q-date--portrai')]//div[contains(@class,'q-date__arrow')]//i[contains(@class,'right')])[1]";
    private String backIconYearXpath = "(//div[contains(@class,'q-date--portrai')]//div[contains(@class,'q-date__arrow')]//i[contains(@class,'left')])[2]";
    private String nextIconYearXpath = "(//div[contains(@class,'q-date--portrai')]//div[contains(@class,'q-date__arrow')]//i[contains(@class,'right')])[2]";
    private String dateItemPickerXpath = "//div[contains(@class,'q-date--portrai')]//div[contains(@class,'q-date__calendar-item')]//span[text()='%s']";


    public DatePicker() {
        waitForPageLoadCompleted();
    }

    public void waitForPageLoadCompleted() {
        this.waitForPageLoadCompletedByXpath(datePickerXpath);
    }

    public void clickBackMonth(int numberOfMonth) {
        logger.info("I click back: " + numberOfMonth + " month(s) Ago");
        for (int i = 0; i < numberOfMonth; i++) {
            getActionBrowser().clickElementByXpath(backIconMonthXpath);
        }
    }

    public void clickNextMonth(int numberOfMonth) {
        logger.info("I click next: " + numberOfMonth + " month(s)");
        for (int i = 0; i < numberOfMonth; i++) {
            getActionBrowser().clickElementByXpath(nextIconMonthXpath);
        }
    }

    public void clickBackYear(int numberOfYear) {
        logger.info("I click back: " + numberOfYear + " year(s) Ago");
        for (int i = 0; i < numberOfYear; i++) {
            getActionBrowser().clickElementByXpath(backIconYearXpath);
        }
    }

    public void clickNextYear(int numberOfYear) {
        logger.info("I click next: " + numberOfYear + " year(s))");
        for (int i = 0; i < numberOfYear; i++) {
            getActionBrowser().clickElementByXpath(nextIconYearXpath);
        }
    }

    public void selectDateOnCalender(int date) {
        logger.info("I select date: " + date + " on date picker");
        String xpath = String.format(dateItemPickerXpath, String.valueOf(date));
        getActionBrowser().clickElementByXpath(xpath);
    }

    public void selectDateYearsAgoOnCalender(int date, int numbersOfYearsAgo) {
        clickBackYear(numbersOfYearsAgo);
        selectDateOnCalender(date);
    }

}
