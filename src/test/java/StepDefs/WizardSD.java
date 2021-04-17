package StepDefs;

import PageObjects.forms.wizard.FormWizardPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

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

    @Then("I fill out Last name: {string}")
    public void iFillOutLastName(String arg0) {
        formWizard.fillInLastName(arg0);
    }
}
