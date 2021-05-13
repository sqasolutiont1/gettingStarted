package StepDefs;

import PageObjects.forms.wizard.FormWizardPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class WizardSD {
    public FormWizardPO formWizard = new FormWizardPO();

    @And("Wizard. I fill out First name: {string}")
    public void iFillOutFirstName(String firstName) {
        formWizard.fillInFirstName(firstName);
    }

    @Given("Wizard. I navigate to the page")
    public void iNavigateToThePage() {
        formWizard.navigateToWizardPage();
    }

//    @After
//    public void closeDriver() {
//        formWizard.closeDriver();
//    }

    @Then("Wizard. I fill out Last name: {string}")
    public void iFillOutLastName(String lastName) {
        formWizard.fillInLastName(lastName);
    }

    @And("Wizard. I press Next button")
    public void iPressNextButton() {
        formWizard.pressNextButton();
    }

    @And("Wizard. I wait for:{string} seconds")
    public void iWaitForSeconds(String seconds) throws InterruptedException {
        Thread.sleep(Integer.parseInt(seconds) * 1000L);
    }

    @When("Wizard. I am on the first step")
    public void iAmOnTheFirstStep() {
        Assert.assertEquals(formWizard.getPanelTitle(), "Enter first step data", "Text Wizard Panel doesn't match.");
    }

    @Then("Wizard. I am on the second step")
    public void iAmOnTheSecondStep() {
        formWizard.waitForStepsChange(2);
        Assert.assertEquals(formWizard.getPanelTitle(), "Enter second step data", "Text Wizard Panel doesn't match.");
    }

    @And("Wizard. I fill out Street Address: {string}")
    public void iFillOutStreetAddress(String streetAddress) {
        formWizard.fillInStreetAddress(streetAddress);
    }

    @Then("Wizard. I fill out City: {string}")
    public void iFillOutCity(String city) {
        formWizard.fillInCity(city);
    }

    @Then("Wizard. I fill out State: {string}")
    public void iFillOutState(String state) {
        formWizard.fillInCity(state);
    }

    @Then("Wizard. I fill out ZIP: {string}")
    public void iFillOutZIP(String zip) {
        formWizard.fillInCity(zip);
    }

    @Then("Wizard. I am on the final step")
    public void iAmOnTheFinalStep() {
        formWizard.waitForStepsChange(3);
        Assert.assertEquals(formWizard.getPanelTitle(), "Finish last step", "Text Wizard Panel doesn't match.");

    }

    @Then("Wizard. I see all information:{string},{string},{string},{string},{string},{string}")
    public void wizardISeeAllInformation(String firstName, String lastName, String streetAddress,
                                         String state, String city, String zip) {
        Assert.assertEquals(formWizard.getFirstName(), firstName, "First name is not correct");
        Assert.assertEquals(formWizard.getLastName(), lastName, "Last name is not correct");
        Assert.assertEquals(formWizard.getAddress(), streetAddress + "\n" + city + state + zip + ",",
                "Address is not correct");
    }
}
