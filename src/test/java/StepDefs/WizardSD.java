package StepDefs;

import PageObjects.forms.wizard.FormWizardPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class WizardSD {
    FormWizardPO formWizard = new FormWizardPO();
    @And("I fill out {string}")
    public void iFillOutFirstName(String value) {
        formWizard.fillInFirstName(value);
    }

    @Given("I navigate to the page")
    public void iNavigateToThePage() {
        formWizard.navigateToWizardPage();
    }
    @After
    public void closeDriver(){
        formWizard.closeDriver();
    }
}
