package StepDefs;

import PageObjects.forms.wizard.FormWizardPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class WizardSD {
    @And("I fill out First name: {string}")
    public void iFillOutFirstName(String value) {
        formWizard.fillInFirstName(value);
    }

    @Given("I navigate to the page")
    public void iNavigateToThePage() {
        formWizard.navigateToWizardPage();
    }

    public FormWizardPO formWizard = new FormWizardPO();

    @After
    public void closeDriver() {
        formWizard.closeDriver();
    }
}
