package StepDefs;

import PageObjects.forms.wizard.FormWizardPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java8.Th;
import org.testng.Assert;

public class WizardSD {
    @And("I fill out First name: {string}")
    public void iFillOutFirstName(String firstName) {
        formWizard.fillInFirstName(firstName);
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
    public void iFillOutLastName(String lastName) {
        formWizard.fillInLastName(lastName);
    }

    @And("I press Next button")
    public void iPressNextButton() {
        formWizard.pressNextButton();
    }

    @And("I wait for:{string} seconds")
    public void iWaitForSeconds(String seconds) throws InterruptedException {
        Thread.sleep(Integer.parseInt(seconds)* 1000L);
    }

    @When("I am on the first step")
    public void iAmOnTheFirstStep() {
        Assert.assertEquals(formWizard.getPanelTitle(), "Enter first step data", "Text Wizard Panel doesn't match.");
    }

    @Then("I am on the second step")
    public void iAmOnTheSecondStep() {
        Assert.assertEquals(formWizard.getPanelTitle(), "Enter second step data", "Text Wizard Panel doesn't match.");
    }

    @And("I fill out Street Address: {string}")
    public void iFillOutStreetAddress(String streetAddress) {
        formWizard.fillInStreetAddress(streetAddress);
    }
}
