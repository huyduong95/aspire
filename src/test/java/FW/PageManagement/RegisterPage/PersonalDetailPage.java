package FW.PageManagement.RegisterPage;

import FW.PageManagement.AbstractPage.AbstractPage;

import static FW.Common.CommonFunction.getRandomUEN;
import static FW.CoreManagement.CoreManagement.getActionBrowser;
import static FW.PageManagement.PageFactory.getDatePicker;

public class PersonalDetailPage extends AbstractPage {

    private String personalDetailPageXpath = "//main[contains(@class,'q-page')]";
    private String getStartedButtonXPath = "//button//span[text()='Get Started']";
    private String personalDetailFormXpath = "(//div[contains(@class,'q-field__append')]//i[contains(@class,'q-select__dropdown-icon')])[2]";
    private String dateOfBirthFieldXpath = "//div[@class='aspire-label__text'][normalize-space(text())='Date of Birth']/ancestor::div[contains(@class,'aspire-field')]//input";
    private String nationalityFieldXpath = "//div[@label='Nationality']//input";
    private String nationalityDropdownXpath = "//div[contains(@class,'q-menu--square')]";
    private String nationalityDropdownItemXpath = "//div[contains(@class,'q-menu--square')]//div[@class='q-item__label'][text()='%s']";
    private String genderFieldXpath = "//div[@label='Gender']//input";
    private String genderDropdownXpath = "//div[contains(@class,'q-virtual-scroll__content')]";
    private String genderDropdownItemXpath = "//div[contains(@class,'q-virtual-scroll__content')]//div[@class='q-item__label'][text()='%s']";
    private String productInterestedXpath = "//div[@label='Which products are you interested in?']//div[@data-cy='person-edit-purposes']";
    private String productInterestedDropdownXpath = "//div[contains(@class,'q-menu--square')]";
    private String productInterestedDropdownItemXpath = "//div[contains(@class,'q-menu--square')]//div[@class='q-item__label'][text()='%s']";
    private String submitButtonXpath = "//button//span[text()='Submit']";
    private String businessNameXpath = "//input[@data-cy='register-business-name']";
    private String registrationNumberUEN = "//input[@data-cy='register-business-registration-numer']";
    private String registrationTypeXpath = "//input[@data-cy='register-business-registration-type']";
    private String registrationTypeDropdownXpath = "//div[contains(@class,'q-menu--square')]";
    private String registrationTypeDropdownItemXpath = "//div[contains(@class,'q-menu--square')]//div[@class='q-item__label'][text()='%s']";
    private String industryFieldXpath = "//input[@data-cy='register-business-industry']";
    private String industryFieldDropdownXpath = "//div[contains(@class,'q-menu--square')]";
    private String industryFieldDropdownItemXpath = "//div[contains(@class,'q-menu--square')]//div[@class='q-item__label'][text()='%s']";
    private String subIndustryFieldXpath = "//input[@data-cy='register-business-sub-industry']";
    private String subIndustryFieldDropdownXpath = "//div[contains(@class,'q-menu--square')]";
    private String subIndustryFieldDropdownItemXpath = "//div[contains(@class,'q-menu--square')]//div[@class='q-item__label'][text()='%s']";

    public PersonalDetailPage() {
    }

    public void waitForPageLoadCompleted() {
        this.waitForPageLoadCompletedByXpath(personalDetailPageXpath);
    }

    public void clickGetStartedButton() {
        logger.info("I click Get Started button");
        getActionBrowser().clickElementByXpath(getStartedButtonXPath);
    }

    // Personal Detail Form

    public void waitForPersonalDetailedPageLoadCompleted() {
        logger.info("I wait for Personal Detail Form load completely");
        getActionBrowser().waitForElementVisible(personalDetailFormXpath);
    }

    public void selectDateOnYearsAgo(int date, int numbersOfYearsAgo) {
        getActionBrowser().clickElementByXpath(dateOfBirthFieldXpath);
        getDatePicker().selectDateYearsAgoOnCalender(date, numbersOfYearsAgo);
    }

    public void clickNationalityField() {
        logger.info("I click nationality field");
        getActionBrowser().clickElementByXpath(nationalityFieldXpath);
        getActionBrowser().waitForElementVisible(nationalityDropdownXpath);
    }

    public void selectNationality(String nationality) {
        clickNationalityField();
        logger.info("I select nationality option: " + nationality);
        String xpath = String.format(nationalityDropdownItemXpath, nationality);
        getActionBrowser().clickElementByXpath(xpath);
    }

    public void clickGenderField() {
        logger.info("I click Gender field");
        getActionBrowser().clickElementByXpath(genderFieldXpath);
        getActionBrowser().waitForElementVisible(genderDropdownXpath);
    }

    public void selectGender(String gender) {
        clickGenderField();
        logger.info("I select gender option: " + gender);
        String xpath = String.format(genderDropdownItemXpath, gender);
        getActionBrowser().clickElementByXpath(xpath);
    }

    public void clickProductInterested() {
        logger.info("I click Which products are you interested in? field");
        getActionBrowser().clickElementByXpath(productInterestedXpath);
        getActionBrowser().waitForElementVisible(productInterestedDropdownXpath);
    }

    public void selectProductInterested(String[] products) {
        clickProductInterested();
        logger.info("I select product option: " + products.toString());
        for (String product : products) {
            String xpath = String.format(productInterestedDropdownItemXpath, product);
            getActionBrowser().clickElementByXpath(xpath);
        }
    }

    public void clickSubmitButton() {
        logger.info("I click on submit button");
        getActionBrowser().clickElementByXpath(submitButtonXpath);
    }

    // Business Details
    public void typeBusinessName(String businessName) {
        logger.info("I type business name: " + businessName);
        getActionBrowser().typeElementByXpath(businessNameXpath, businessName);
    }

    public void clickRegistrationType() {
        logger.info("I click Registration Type field");
        getActionBrowser().clickElementByXpath(registrationTypeXpath);
        getActionBrowser().waitForElementVisible(registrationTypeDropdownXpath);
    }

    public void selectRegistrationType(String registrationType) {
        clickRegistrationType();
        logger.info("I select Registration Type item: " + registrationType);
        String xpath = String.format(registrationTypeDropdownItemXpath, registrationType);
        getActionBrowser().clickElementByXpath(xpath);
    }

    public void clickIndustryField() {
        logger.info("I click Industry field");
        getActionBrowser().clickElementByXpath(industryFieldXpath);
        getActionBrowser().waitForElementVisible(industryFieldDropdownXpath);
    }

    public void selectIndustry(String industry) {
        clickIndustryField();
        logger.info("I select Industry item: " + industry);
        String xpath = String.format(industryFieldDropdownItemXpath, industry);
        getActionBrowser().clickElementByXpath(xpath);
    }

    public void clickSubIndustryField() {
        logger.info("I click Sub-Industry field");
        getActionBrowser().clickElementByXpath(subIndustryFieldXpath);
        getActionBrowser().waitForElementVisible(subIndustryFieldDropdownXpath);
    }

    public void selectSubIndustry(String subIndustry) {
        clickSubIndustryField();
        logger.info("I select Sub-Industry item: " + subIndustry);
        String xpath = String.format(subIndustryFieldDropdownItemXpath, subIndustry);
        getActionBrowser().clickElementByXpath(xpath);
    }

    public void typeRandomRegistrationNumberUEN() {
        String randomUEN = getRandomUEN();
        logger.info("I type Registration Number UEN: " + randomUEN);
        getActionBrowser().typeElementByXpath(registrationNumberUEN, randomUEN);
    }

}
