package StepDefs;

import PageObjects.forms.wizard.FormWizardPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class WizardSD {
    FormWizardPO formWizard = new FormWizardPO();
    @And("I fill out {string}")
    public void iFillOutFirstName(String value) throws InterruptedException {
        formWizard.fillInFirstName(value);
        Thread.sleep(5000);
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
