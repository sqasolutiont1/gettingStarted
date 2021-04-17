package StepDefs;

import PageObjects.forms.wizard.FormWizardPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
        formWizard.waitForStepsChange(2);
        Assert.assertEquals(formWizard.getPanelTitle(), "Enter second step data", "Text Wizard Panel doesn't match.");
    }

    @And("I fill out Street Address: {string}")
    public void iFillOutStreetAddress(String streetAddress) {
        formWizard.fillInStreetAddress(streetAddress);
    }

    @Then("I fill out City: {string}")
    public void iFillOutCity(String city) {
        formWizard.fillInCity(city);
    }

    @Then("I fill out State: {string}")
    public void iFillOutState(String state) {
        formWizard.fillInCity(state);
    }

    @Then("I fill out ZIP: {string}")
    public void iFillOutZIP(String zip) {
        formWizard.fillInCity(zip);
    }

    @Then("I am on the final step")
    public void iAmOnTheFinalStep() {
        formWizard.waitForStepsChange(3);
        Assert.assertEquals(formWizard.getPanelTitle(), "Finish last step", "Text Wizard Panel doesn't match.");

    }

    @Then("I see all information")
    public void iSeeAllInformation() {
        Assert.assertEquals(formWizard.getFirstName(),"Vlad", "First name is not correct");
        Assert.assertEquals(formWizard.getLastName(), "Ka", "Last name is not correct");
        Assert.assertEquals(formWizard.getAddress(), "This is our awesome street address!\nMy CityMy Statemy Zip,",
                "Address is not correct");
    }
}
