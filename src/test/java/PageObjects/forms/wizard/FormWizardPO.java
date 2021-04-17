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
        return getClickableElement(By.cssSelector("h2[class='ng-scope']")).getText();
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
     * @param lastName - accepts lastName from the data source and fill in text field with the value
     */
    public void fillInLastName(String lastName) {
        /**
         * once we call the function: getClickableElement
         * the instanciation of Locator will be executed : By.cssSelector("[name='lastName']")
         * and the result of this instanciation will be passed to the function: getClickableElement
         * and the result of the execution of this function is WebElement. and we getting access to all the functions
         * which we can apply to the Selenium WebElements. - sendKeys.
         */
        getClickableElement(By.cssSelector("[name='lastName']")).sendKeys(lastName);
    }

    public void pressNextButton() {
        getClickableElement(By.xpath("//*[normalize-space()='Next']")).click();
    }

    public void fillInStreetAddress(String streetAddress) {
        getClickableElement(By.cssSelector("[name='streetAddress']")).sendKeys(streetAddress);
    }

    public void fillInCity(String city) {
        getClickableElement(By.cssSelector("[name='city']")).sendKeys(city);
    }

    public void fillInState(String state) {
        getClickableElement(By.cssSelector("[name='state']")).sendKeys(state);
    }

    public void fillInZIP(String zip) {
        getClickableElement(By.cssSelector("[name='postalCode']")).sendKeys(zip);
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

    public void waitForStepsChange() {
        /**
         * we are going to check if the element which we are expecting to be in the "current" state has its state.
         * 1. Save the previous Step, and assume/wait that the next step will be as expected.
         * 1.1. Class/List/Array/Map: there we are going to store all the possible steps in our app: F,S,L.
         * 1.2. and knowing that we were on the step 1. we wil expect step 2, and so on.
         *
         * 2. We could try to make methods which will handle each step. Why it is ok-ish to do it?
         * 2.1. We have only one object like this.
         * 2.2. We have only 3 steps.
         *
         */

    }
}
