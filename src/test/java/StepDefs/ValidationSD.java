package StepDefs;

import PageObjects.forms.validation.ValidationPO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidationSD {
    ValidationPO validation = new ValidationPO();

    @When("Validation. I fill out Name:{string}")
    public void validationIFillOutName(String name) {
        validation.fillInName(name);
    }

    @Then("Validation. I fill out UserName:{string}")
    public void validationIFillOutUserName(String userName) {
        validation.fillUserName(userName);
    }

    @Then("Validation. I fill out Email:{string}")
    public void validationIFillOutEmail(String email) {
        validation.fillEmail(email);
    }

    @And("Validation. I press on Submit")
    public void validationIPressOnSubmit() {
        validation.pressSubmit();
    }

    @And("Validation. I print Alert")
    public void validationIPrintAlert() {
        validation.readAlert();
    }

    @And("Validation. I wait for:{string} seconds")
    public void validationIWaitForSeconds(String seconds) throws InterruptedException {
        Thread.sleep(Integer.parseInt(seconds) * 1000L);
    }

    @Given("Validation. I navigate to the Validation page")
    public void validationINavigateToTheValidationPage() {
        validation.navigateToValidationPO();
    }
}
