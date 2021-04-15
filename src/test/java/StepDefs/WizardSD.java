package StepDefs;

import StepDefs.baseStepDef.BaseStepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class WizardSD extends BaseStepDef {
    @And("I fill out {string}")
    public void iFillOutFirstName(String value) {
        formWizard.fillInFirstName(value);
    }

    @Given("I navigate to the page")
    public void iNavigateToThePage() {
        formWizard.navigateToWizardPage();
    }

}
