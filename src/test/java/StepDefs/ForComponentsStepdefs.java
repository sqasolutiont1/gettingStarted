package StepDefs;

import PageObjects.forms.components.FormComponentsPO;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ForComponentsStepdefs {
    FormComponentsPO formComponents = new FormComponentsPO();
    @Given("Form Components. I navigate to the Components page")
    public void formComponentsINavigateToTheComponentsPage() {
        formComponents.navigateToFormComponents();
    }

    @Then("Form Components. I fill in email with data: {string}")
    public void formComponentsIFillInEmailWithData(String value) {
        formComponents.fillInEmailAddress(value);
    }

    @And("Form Components. I wait for:{string} seconds")
    public void iWaitForSeconds(String seconds) throws InterruptedException {
        Thread.sleep(Integer.parseInt(seconds)* 1000L);
    }

    @After
    public void closeDriver() {
        formComponents.closeDriver();
    }
}
