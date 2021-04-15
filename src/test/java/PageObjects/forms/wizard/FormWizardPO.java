package PageObjects.forms.wizard;

import PageObjects.BaseClasses.BasePageObject;
import org.openqa.selenium.By;

public class FormWizardPO extends BasePageObject {

    public void navigateToWizardPage() {
        webDriver.navigate().to(baseURL + "/forms/wizard/step_one");
        waitForPageLoaded();
    }


    public String getHeader() {
        return "header";
    }

    public String getPanelTitle() {
        return "PanelTitle";
    }

    public void pressOnFirstStep() {
    }

    public void pressOnSecondStep() {
    }

    public void pressOnLastStep() {
    }

    public String getWizardViewHeaderFirstStep() {
        return "WizardViewHeader";
    }

    public String getWizardViewHeaderSecondStep() {
        return "WizardViewHeader";
    }

    public String getWizardViewHeaderLastStep() {
        return "WizardViewHeader";
    }

    /**
     * @param firstName - accepts firstName from the data source and fill in text field with the value
     */
    public void fillInFirstName(String firstName) {
        By locator = By.cssSelector("[name='firstName']");
        getClickableElement(locator).sendKeys(firstName);
    }

    /**
     *
     * @param lastName - accepts lastName from the data source and fill in text field with the value
     */
    public void fillInLastName(String lastName) {

    }

    public void pressNextButton() {
        // use click() instead of sendKeys.
    }

    public void fillInStreetAddress(String streetAddress) {
    }

    public void fillInCity(String city) {
    }

    public void fillInState(String state) {
    }

    public void fillInZIP(String zip) {
    }

    public void pressOnPreviousButton() {
    }

    public void pressSubmitButton() {
    }

    public String getFirstName() {
        return "firstname";
    }

    public String getLastName() {
        return "lastname";
    }

    public String getAddress() {
        return "address";
    }
}
